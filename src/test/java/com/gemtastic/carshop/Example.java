package com.gemtastic.carshop;

import com.gemtastic.carshop.db.tables.records.MakeRecord;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import static com.gemtastic.carshop.db.Tables.MAKE;

public final class Example
{
    private static final String DB_PROPERTIES = "/db.properties";
    private static final String DB_URL;
    private static final String DB_USERNAME;
    private static final String DB_PASSWORD;

    static {
        final CharsetDecoder decoder = StandardCharsets.UTF_8.newDecoder()
            .onMalformedInput(CodingErrorAction.REPORT)
            .onUnmappableCharacter(CodingErrorAction.REPORT);

        final InputStream in
            = Example.class.getResourceAsStream(DB_PROPERTIES);

        if (in == null)
            throw new ExceptionInInitializerError(DB_PROPERTIES + " not found");

        try (
            final InputStreamReader reader = new InputStreamReader(in, decoder);
        ) {
            final Properties properties = new Properties();
            properties.load(reader);
            DB_URL = properties.getProperty("db.url");
            DB_USERNAME = properties.getProperty("db.username");
            DB_PASSWORD = properties.getProperty("db.password");
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }

        if (DB_URL == null
            || DB_USERNAME == null
            || DB_PASSWORD == null)
            throw new ExceptionInInitializerError();
    }

    private static final List<String> MAKEVALUES = Arrays.asList(
        "BMW",
        "Audi",
        "Lotus",
        "Peugeot",
        "Saab",
        "Toyota"
    );

    public static void main(final String... args)
        throws SQLException
    {
        final DSLContext jooq = getJooq();

        MAKEVALUES.stream().forEach(make -> {
            final MakeRecord record = jooq.newRecord(MAKE);
            record.setMake(make);
            record.store();
        });

        jooq.insertInto(MAKE)
            .values(19, "Mercedes")
            .execute();
    }

    private static DSLContext getJooq()
        throws SQLException
    {
        final Connection connection
            = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        return DSL.using(connection, SQLDialect.POSTGRES);
    }
}
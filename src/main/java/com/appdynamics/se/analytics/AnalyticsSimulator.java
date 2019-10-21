package com.appdynamics.se.analytics;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;
import java.util.HashMap;

/**
 * Created by Matt Cleve - AppDynamics Sr. Sales Engineer on 7/30/15.
 *
 * AnalyticsSimulator is used to simulate load for Transaction Analytics purposes only.
 *
 */
public class AnalyticsSimulator
{

    private static final Logger log = Logger.getLogger( AnalyticsSimulator.class.getName() );
    private static final String DATA_FILE = "load.csv";
    private static final String DATA_COLUMN_SEPERATOR = ",";

    private Random rand;

    public AnalyticsSimulator() {
        rand = new Random();
    }

    // Business Transaction 1
    public void bt1(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        handleUserExperience(userExperience, errorMsg);
    }

    // Business Transaction 2
    public void bt2(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 2 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 3
    public void bt3(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 3 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 4
    public void bt4(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 4 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 5
    public void bt5(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 5 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 6
    public void bt6(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 6 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 7
    public void bt7(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 7 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 8
    public void bt8(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 8 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 9
    public void bt9(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 9 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 10
    public void bt10(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg, String uuid)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 10 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | uuid: " + uuid + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error"))
        {
            try
            {
                throw new RuntimeException(errorMsg);
            }
            catch (RuntimeException ex)
            {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    private void handleUserExperience(String userExperience, String errorMsg) {
        // Simulate user experience - Normal, Slow, Very Slow, Error
        if(userExperience.equals("Normal")) {
            this.sleep(100, 500);
        } else if(userExperience.equals("Slow")) {
            this.sleep(1500, 4000);
        } else if(userExperience.equals("Very Slow")) {
            this.sleep(4500, 5000);
        } else {
            // This is an Error status
            this.sleep(9000, 15000);
        }

        // Simulate user experience - Error
        if(userExperience.equals("Error")) {
            try {
                throw new SocketException(errorMsg);
            } catch (Exception ex) {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    /**
     * Sleep the thread for a random amount between low and high.
     *
     * @param low Minimum thread sleep in milliseconds
     * @param high Maximum thread sleep in milliseconds
     */
    private void sleep(int low, int high) {
        try {
            // Get a random amount of sleep between low and high
            long sleep = this.rand.nextInt(high-low)+low;

            log.log(Level.INFO, "Sleeping for "+(sleep/1000)+" seconds");

            Thread.sleep(sleep);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    private String getString(String[] array, int index) {
        try {
            return array[index];
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Unable to get String with index: "+index+" from array");
            ex.printStackTrace();
            return "";
        }
    }

    private Integer getInteger(String[] array, int index) {
        try {
            String stringValue = getString(array, index);
            stringValue = stringValue.replace(" ", "");

            return Integer.valueOf(stringValue);
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Unable to get Integer with index: "+index+" from array");
            ex.printStackTrace();
            return 0;
        }
    }

    public static void main(String [] args)
    {
        boolean running = true;
        while (running)
        {
            HashMap<String, String> ids = new HashMap<String, String>();
            try
            {
                AnalyticsSimulator aS = new AnalyticsSimulator();

                BufferedReader reader = new BufferedReader(new InputStreamReader(AnalyticsSimulator.class.getClassLoader().getResourceAsStream(DATA_FILE)));
                String line;
                int counter = 0;

                while ((line = reader.readLine()) != null)
                {
                    String[] values = line.split(DATA_COLUMN_SEPERATOR);
                    counter++;

                    log.log(Level.INFO, "Processing line "+counter+", length: "+values.length);
                    log.log(Level.INFO, "0:"+values[0]+", 1:"+values[1]);

                    if (values[0].equals("BT")) {
                        // Skip the header line
                        log.log(Level.INFO, "Skipping line "+counter+" because it's the header line");
                        continue;

                    } else if(!values[0].equals("")) {
                        String bt = aS.getString(values, 0);
                        String s1 = aS.getString(values, 1);
                        String s2 = aS.getString(values, 2);
                        String s3 = aS.getString(values, 3);
                        String s4 = aS.getString(values, 4);
                        String s5 = aS.getString(values, 5);
                        Integer i1 = aS.getInteger(values, 6);
                        Integer i2 = aS.getInteger(values, 7);
                        Integer i3 = aS.getInteger(values, 8);
                        Integer i4 = aS.getInteger(values, 9);
                        Integer i5 = aS.getInteger(values, 10);
                        String uX = aS.getString(values, 11); // User experience
                        String eR = aS.getString(values, 12); // Error message

                        String uuid = UUID.randomUUID().toString();
                        if(values.length >= 14) {
                          String identifier = aS.getString(values, 13);
                          if(ids.containsKey(identifier)) {
                            uuid = ids.get(identifier);
                          } else {
                            ids.put(identifier, uuid);
                          }
                        }

                        if (bt.equals("1"))
                            aS.bt1(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("2"))
                            aS.bt2(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("3"))
                            aS.bt3(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("4"))
                            aS.bt4(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("5"))
                            aS.bt5(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("6"))
                            aS.bt6(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("7"))
                            aS.bt7(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("8"))
                            aS.bt8(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("9"))
                            aS.bt9(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                        else if (bt.equals("10"))
                            aS.bt10(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR, uuid);
                    }
                }

                reader.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

package com.appdynamics.se.analytics;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void bt1(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

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
        if(userExperience.equals("Error")) {
            try {
                throw new SocketException(errorMsg);
            } catch (Exception ex) {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
    }

    // Business Transaction 2
    public void bt2(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt3(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt4(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt5(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt6(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt7(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt8(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt9(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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
    public void bt10(String s1, String s2, String s3, String s4, String s5, Integer i1, Integer i2, Integer i3, Integer i4, Integer i5, String userExperience, String errorMsg)
    {
        // Log business transaction data
        log.log(Level.INFO, "Business Transaction 1 - s1: " + s1 + " | s2: " + s2 + " | s3: " + s3 + " | s4: " + s4 + " | s5: " + s5 + " | i1: " + i1 + " | i2: " + i2 + " | i3: " + i3 + " | i4: " + i4 + " | i5: " + i5 + " | userExperience: " + userExperience);

        // Simulate user experience - Normal, Very Slow
        try
        {
            if(userExperience.equals("Normal"))
                this.sleep(800, 1500);
            else if(userExperience.equals("Very Slow"))
                this.sleep(12000, 15000);
            else
                this.sleep(800, 1500);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
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

    public static void main(String [] args)
    {
        boolean running = true;
        while (running)
        {
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

                    log.log(Level.INFO, "Processing line "+counter+", length: "+values.length+", 0:"+values[0]+", 1:"+values[1]);

                    if (values[0].equals("BT")) {
                        // Skip the header line
                        log.log(Level.INFO, "Skipping line "+counter+" because it's the header line");
                        continue;

                    } else if(!values[0].equals("")) {
                        String bt = values[0];
                        String s1 = values[1];
                        String s2 = values[2];
                        String s3 = values[3];
                        String s4 = values[4];
                        String s5 = values[5];
                        Integer i1 = Integer.valueOf(values[6].replace(" ", ""));
                        Integer i2 = Integer.valueOf(values[7].replace(" ", ""));
                        Integer i3 = Integer.valueOf(values[8].replace(" ", ""));
                        Integer i4 = Integer.valueOf(values[9].replace(" ", ""));
                        Integer i5 = Integer.valueOf(values[10].replace(" ", ""));
                        String uX = values[11]; // User experience
                        String eR = values[12]; // Error message

                        if (bt.equals("1"))
                            aS.bt1(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("2"))
                            aS.bt2(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("3"))
                            aS.bt3(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("4"))
                            aS.bt4(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("5"))
                            aS.bt5(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("6"))
                            aS.bt6(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("7"))
                            aS.bt7(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("8"))
                            aS.bt8(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("9"))
                            aS.bt9(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
                        else if (bt.equals("10"))
                            aS.bt10(s1, s2, s3, s4, s5, i1, i2, i3, i4, i5, uX, eR);
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

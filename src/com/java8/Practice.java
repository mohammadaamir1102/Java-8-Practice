package com.java8;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Practice {

    public static void main(String[] args) throws IOException {

        int width = 963;
        int height = 640;
        BufferedImage image= null;
        try {
            File output_file = new File("C:\\Users\\user\\Downloads\\image.jpeg");
            image = new BufferedImage(
                    width, height, BufferedImage.TYPE_INT_ARGB);

            // Reading input file
            image = ImageIO.read(output_file);
            System.out.println("Reading completed" + image.getSource() + image.getData());
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            // Output file path
            File output_file = new File(
                    "C:\\Users\\user\\Downloads\\image.jpeg");

            // Writing to file taking type and path as
            ImageIO.write(image, "jpeg", output_file);

            System.out.println("Writing complete." +image.getSource() + output_file);
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}


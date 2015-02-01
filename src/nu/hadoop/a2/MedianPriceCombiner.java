/**
 * @author Ryan Millay
 * @author Shivastuti Koul
 * CS6240
 * Assignment 2
 */

package nu.hadoop.a2;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * Input Key: product category
 * Input Value: array of prices for the given category
 * Output Key: product category
 * Output Value: median price for the given category
 */
public class MedianPriceCombiner 
	extends Reducer<Text, DoubleWritable, Text, DoubleWritable> {

}

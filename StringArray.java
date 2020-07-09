```java
package trivera.storage;

import java.util.Arrays;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera
 * Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of Trivera
 * Technologies, LLC
 *
 * Copyright (c) 2019 Trivera Technologies, LLC. http://www.triveratech.com
 * </p>
 *
 * @author Trivera Technologies Tech Team.
 */
public class StringArray {

	//CODE1:Declare private fields for state
    private int count;
    private String[] data = new String[5];

	//CODE2:Declare public size method
    /**
     * @return the number of elements in the Dynamic Array
     */
     public int size() {
            return count;
     }
	//CODE3:Declare public get method
    /**
     * Retrieve a String at a given position in the array
     *
     * @param index
     * The index in the dynamic array
     * @return the String at the given index. Will throw an exception
     * when an index outside of the range of the array will be requested
     */
    public String get(int index) {
        // when someone asks for data outside of array Exception will be thrown
        return data[index];

    }

	//CODE4:Declare public add method
    /**
     * Add a String to next avaliable 'slot' in the array
     *
     * @param string
     * The string to be added
     */
     public void add(String string) {
    // do not add null pointer
        if (string == null) {
            return;
        }
    // add the data to the array
    // increase counter after add!
        data[count++] = string;

    //when array is full create a bigger array
        if (count == data.length) {
    // create array 5 times bigger than original
            String[] newData = new String[data.length + 5];
    // copy the data from the old array into the new Array
            System.arraycopy(data, 0, newData, 0, data.length);
    // move the reference to the new array to the instance variable
            this.data = newData;
        }
    }

	//CODE5:Declare public remove method
    /**
     * Remove the given String from the array. When the String value is
     * present multiple times - it should be removed multiple times
     *
     * @param string
     * The string to be removed
     */
     public void remove(String string) {
    // when param is null do nothing
        if (string == null)
            return;
    // create a new Array with the same size as the original
        String[] newData = new String[data.length];
        int count = 0;
    // iterate over all Objects in the instance array
        for (String currentObject : data) {
    // since the aray only holds null pointers at the end we can stop once
    // reference is null
            if (currentObject == null) {
                    break;
            }
    // when the String in the original array is not equal
        if (!(string.equals(currentObject))) {
            newData[count++] = currentObject;
            }
        }
    // Move the reference to the new array to the instance variable
        this.data = newData;
    // set the instance counter to the amount of elements copied
        this.count = count;
    }

	//CODE6:Declare public clear method
    /**
     * Remove all Strings fom the dynamic array
     */
     public void clear() {
         Arrays.fill(data, null);
         this.count = 0;
     }
}
```

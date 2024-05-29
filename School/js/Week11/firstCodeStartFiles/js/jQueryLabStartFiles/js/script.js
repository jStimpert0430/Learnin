/*
	JavaScript Lab - Joshua Stimpert - week 11 - Fall 2019
*/

// create a new function named display that passes a parameter named event
function display(event)

// statement block
{
 // enter a jQuery selector to select the currentTarget value of the event parameter
 // This function will be called when a user clicks either of the h3 elements, the selector references the h3 element the user clicks

 // The .next() method traverses the DOM tree to the element that follows the h3 element

 // Use the jQuery fadeIn() function

   $(this).next().fadeIn("slow");
}

// Event listener for the h3 elements that call the display() function
$("h3").click(display);

//Joshua Stimpert - week 10 lab - Web Development with Javascript - Fall 2019


//  This function is enclosed in parenthesis, something you haven't seen yet
//  This type of function is invoked immediately, AKA Immediately-Invoked Function Expression
//  IIFE, pronounced iffy

(function()
{
  function buildQuiz()
  {
    // we'll need a place to store the HTML output
    const output = [];

    // for each question...
	// observe the => syntax, which is basically the same as using return

    myQuestions.forEach((currentQuestion, questionNumber) =>
	{
      // we'll want to store the list of answer choices
      const answers = [];

      // and for each available answer...
      for (letter in currentQuestion.answers)
	  {
        // ...add an HTML radio button, use the push method to add an array item
        answers.push(
          `<label>
            <input type="radio" name="question${questionNumber}" value="${letter}">
            ${letter} :
            ${currentQuestion.answers[letter]}
          </label>`
        );
      }

      // add this question and its answers to the output
      output.push(
        `<div class="question"> ${currentQuestion.question} </div>
        <div class="answers"> ${answers.join("")} </div>`
      );
    });

    // finally combine our output list into one string of HTML and put it on the page
    quizContainer.innerHTML = output.join("");
  }

  function showResults()
  {
    // gather answer containers from our quiz
    const answerContainers = quizContainer.querySelectorAll(".answers");

    // keep track of user's answers
    let numCorrect = 0;

    // for each question...
    myQuestions.forEach((currentQuestion, questionNumber) =>
	{
      // find selected answer
      const answerContainer = answerContainers[questionNumber];
      const selector = `input[name=question${questionNumber}]:checked`;
      const userAnswer = (answerContainer.querySelector(selector) || {}).value;

      // if answer is correct
      if (userAnswer === currentQuestion.correctAnswer)
	  {
        // add to the number of correct answers
        numCorrect++;

        // color the answers green
        answerContainers[questionNumber].style.color = "lightgreen";
      } else
	  {
        // if answer is wrong or blank
        // color the answers red
        answerContainers[questionNumber].style.color = "red";
      }
    });

    // show number of correct answers out of total
    resultsContainer.innerHTML = `${numCorrect} out of ${myQuestions.length}`;
  }

 /*
    The purpose of this assignment is for you to create at least five (5)
      JavaScript quiz questions.

	It's also a good lesson in observing functional code to clarify the concepts

*/

  const quizContainer = document.getElementById("quiz");
  const resultsContainer = document.getElementById("results");
  const submitButton = document.getElementById("submit");
  const myQuestions =
  [
    {
      question: "DOM is an Acronym for...",
      answers:
	  {
        a: "Domino's Pizza",
        b: "The Godfather",
        c: "Document Object Model"
      },
      correctAnswer: "c"
    },
    {
      question: "What is your Favorite Scripting Language?",
      answers:
	  {
        a: "Java",
        b: "HTML",
        c: "JavaScript"
      },
      correctAnswer: "c"
    },
    {
      question: "When a user views a page containing JavaScript code, which machine actually executes the script?",
      answers:
	  {
        a: "The User's router",
        b: "The Web Server",
        c: "The User's machine running a Web Browser"
      },
      correctAnswer: "c"
    },
    {
      question: "Declaring variables with var has a global scope, declaring variables with let has a _____ scope.",
      answers:
    {
        a: "Node",
        b: "Block",
        c: "Function"
      },
      correctAnswer: "b"
    },
    {
      question: "What is the typeOf NaN return?",
      answers:
    {
        a: "True/False",
        b: "Integer",
        c: "Number"
      },
      correctAnswer: "c"
    },
    {
      question: "The _____ function attempts to recieve input from a user.",
      answers:
    {
        a: "prompt",
        b: "question",
        c: "alert"
      },
      correctAnswer: "a"
    },
    {
      question: "To edit the html found within an element from javascript you would set the element.____ property",
      answers:
    {
        a: "value",
        b: "HTML",
        c: "innerHTML"
      },
      correctAnswer: "c"
    },
    {
      question: "The \"_______\" statement is used to make modern javascript throw stricter errors",
      answers:
    {
        a: "Use Strict",
        b: "Strict Mode",
        c: "Sloppy Mode"
      },
      correctAnswer: "a"
    }
  ];

  // display quiz right away
  buildQuiz();

  // on submit, show results
  submitButton.addEventListener("click", showResults);
})();

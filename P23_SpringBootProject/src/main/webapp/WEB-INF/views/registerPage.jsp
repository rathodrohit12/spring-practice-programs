<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<style>
    /* Global styling */
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    h1 {
        text-align: center;
        color: #333;
        font-size: 20px; /* Reduced font size */
        margin-bottom: 15px; /* Reduced margin */
    }

    /* Form container */
    form {
        background-color: #ffffff;
        padding: 20px; /* Reduced padding */
        border-radius: 8px;
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1); /* Reduced shadow */
        width: 100%;
        max-width: 350px; /* Reduced max width */
    }

    /* Form labels */
    label {
        font-weight: bold;
        color: #555;
        margin-bottom: 4px; /* Reduced margin */
        display: block;
    }

    /* Input fields */
    input[type="text"],
    input[type="email"],
    input[type="tel"],
    input[type="password"] {
        width: 100%;
        padding: 8px; /* Reduced padding */
        margin: 6px 0; /* Reduced margin */
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        font-size: 14px; /* Reduced font size */
    }

    input[type="text"]:focus,
    input[type="email"]:focus,
    input[type="tel"]:focus,
    input[type="password"]:focus {
        border-color: #007bff;
        outline: none;
    }

    /* Submit and Reset buttons */
    button[type="submit"],
    button[type="reset"] {
        width: 48%;
        padding: 10px; /* Reduced padding */
        border: none;
        border-radius: 4px;
        font-size: 14px; /* Reduced font size */
        cursor: pointer;
        transition: background-color 0.3s;
    }

    button[type="submit"] {
        background-color: #007bff;
        color: white;
        margin-right: 4%;
    }

    button[type="submit"]:hover {
        background-color: #0056b3;
    }

    button[type="reset"] {
        background-color: #f44336;
        color: white;
    }

    button[type="reset"]:hover {
        background-color: #d32f2f;
    }

    /* Link to login page */
    a {
        display: block;
        text-align: center;
        margin-top: 15px; /* Reduced margin */
        color: #007bff;
        text-decoration: none;
        font-size: 13px; /* Reduced font size */
    }

    a:hover {
        text-decoration: underline;
    }

    /* Mobile responsiveness */
    @media (max-width: 600px) {
        form {
            padding: 15px; /* Further reduced padding */
            width: 90%;
        }

        button[type="submit"],
        button[type="reset"] {
            width: 100%;
            margin: 5px 0;
        }
    }
</style>
</head>
<body>

<form action="register" method="get">
    <h1>Register</h1>

    <label for="name">Enter Name</label>
    <input type="text" name="name" required><br>

    <label for="email">Enter Email</label>
    <input type="email" name="email" required><br>

    <label for="mobile">Enter Mobile Number</label>
    <input type="tel" name="mobile" required><br>

    <label for="pass">Enter Password</label>
    <input type="password" name="pass" required><br>

    <div style="display: flex; justify-content: space-between;">
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </div>

    <a href="/">Already have an account? Login here</a>
</form>

</body>
</html>

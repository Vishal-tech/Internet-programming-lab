import React from 'react';
import ReactDOM from 'react-dom';

export default function Reg(){
    return (
    <div>
        <h2>Registration for Conference/Workshop</h2>
    <br />

    <table align="center">
    <td>
    <form>
    <label for="name">Name</label>
    <input name="name" type="text" id="name" /><br />

    <label for="phno">Phone number</label>
    <input name="phno" type="number" id="phno" /><br />

    <label for="dob">DOB</label>
    <input name="dob" type="date" id="dob" /><br />

    <label for="email">Email</label>
    <input name="email" type="email" id="email" /><br />

    <label for="job">You are a/an</label>
    <input name="job" type="radio" id="job" />Student
    <input name="job" type="radio" id="job" />Sports person
    <input name="job" type="radio" id="job" />Other
    <br />

    <label for="att">You want to attend </label>
    <input name="att" type="checkbox" id="att" />Workshop
    <input name="att" type="checkbox" id="att" />Conference
    <br /><br />

    <button type="submit">Submit</button>
    <button type="reset">Reset</button>
    
    </form>
    </td>
    </table>
    
</div>
);
}

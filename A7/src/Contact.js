import React from 'react';
import ReactDOM from 'react-dom';

export default function Contact(){
    return (
<div>   
        <h2>Contact us</h2>
    <p><b>Email</b>: support@icsdii.com</p>
    <p><b>Phone</b>: +91 1122334455</p>

    <br /><br />
    <table id="contact_table" align="center">
    <td>
    <h3>Write to us for help</h3>
    <form>

    <label for="name">Name:</label>
    <input name="name" type="text" id="name" /><br />

    <label for="email">Email:</label>
    <input name="email" type="email" id="email" /><br />

    <label for="query">Query:</label>
    <textarea name="query" type="text" id="query" placeholder="Write something.."></textarea><br />
   
    <br /><br />
    <button type="submit">Submit</button>
    <button type="reset">Reset</button>
    </form>
    </td>
    </table>
</div>
    );
}
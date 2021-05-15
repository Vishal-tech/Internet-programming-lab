import React from 'react';
import ReactDOM from 'react-dom';
import Home from './Home.js';
import Committee from './Committee.js';
import Call from './Call.js';
import Dates from './Dates.js';
import Workshop from './Workshop.js';
import Reg from './Reg.js';
import Contact from './Contact.js';

import{
	BrowserRouter as Router,
	Switch,
	Route,
	Link
	} from "react-router-dom";

export default function Header(){
	return(
		<Router>
		<div className="navi">
			<nav>
			<ul>
			<li class="header"><Link to="/">|| Home |</Link></li>
			<li class="header"><Link to="/Committee">| Committee |</Link></li>
			<li class="header"><Link to="/Call">| Call for papers |</Link></li>
			<li class="header"><Link to="/Dates">| Important Dates |</Link></li>
			<li class="header"><Link to="/Workshop">| Workshop |</Link></li>
			<li class="header"><Link to="/Reg">| Registration |</Link></li>
			<li class="header"><Link to="/Contact">| Contact ||</Link></li>

			</ul>
			</nav>
		</div>
		
		<Switch>
			<Route path="/Committee">
			<Committee />
			</Route>
			<Route path="/Call">
			<Call />
			</Route>
			<Route path="/Dates">
			<Dates />
			</Route>
			<Route path="/Workshop">
			<Workshop />
			</Route>
			<Route path="/Reg">
			<Reg />
			</Route>
			<Route path="/Contact">
			<Contact />
			</Route>
			<Route path="/">
			<Home />
			</Route>
		</Switch>
	</Router>
	);
}

/*<Switch>
		<Route path="/Commitee">
		<Commitee/>
		</Route>
		<Route path="/Call">
		<Call/>
		</Route>
		<Route path="/Dates">
		<Dates/>
		</Route>
		<Route path="/Workshop">
		<Workshop/>
		</Route>
		<Route path="/Registration">
		<Registration/>
		</Route>
		<Route path="/Contact">
		<Contact/>
		</Route>
		<Route path="/">
		<Home/>
		</Route>
		</Switch>
		
				<li id="header"><Link to="/Commitee">Commitee</Link></li>
			<li id="header"><Link to="/Call">Call For Papers</Link></li>
			<li id="header"><Link to="/Dates">Important Dates</Link></li>
			<li id="header"><Link to="/Workshop">Workshop</Link></li>
			<li id="header"><Link to="/Registration">Registraion</Link></li>
			<li id="header"><Link to="/Contact">Contact</Link></li>
		
		
					<div class="heading">
				<img id="logo" src="Images/logo.png" width="50" height="50" class="logo"></img>
				<br></br>
				<h1>ICSDII</h1>  
				<p id="full_form" style="text-align:center;">International Conference on Sports development in India</p>
		</div>
		
		
		
		*/
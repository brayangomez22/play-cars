import React from 'react';
import { BrowserRouter, Route, Switch } from "react-router-dom";

import Home from '../pages/Home';
import Game from '../pages/Game';

function App() {
  return (
    <BrowserRouter> 
      <Switch>
        <Route exact path="/" component={Home} />
        <Route path="/game" component={Game} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;

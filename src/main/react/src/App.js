import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class Comment extends Component {
  doit() {
          let q = [];
          var c = this.props.data;
          for(var i=0; i<c.length; i++) {
                  console.log(c[i].author);
                  q.push(c[i].author);
          }

          return q;
  }
  render() {
          return (<div>{this.doit()}</div>);
  }
}
class App extends Component {
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <h2>Welcome to React</h2>
        </div>
        <p className="App-intro">
            <Comment data={this.props.data} />
        </p>
      </div>
    );
  }
}

export default App;

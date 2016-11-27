import React from 'react';
import ReactDOMServer from 'react-dom/server';
import ReactDOM from 'react-dom';
import App from './App';
import './index.css';

/* global Java */

window.serverRender = (comments, courses) => {
        var data = Java.from(comments);
        var c = Java.from(courses);
        console.log(c[0].title);
        return ReactDOMServer.renderToString(<App data={data} />);
};

window.clientRender = (comments) => {
        comments = comments || [];
        ReactDOM.render(<App data={comments} />, document.getElementById('root'));
}

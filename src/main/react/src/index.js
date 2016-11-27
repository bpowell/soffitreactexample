import React from 'react';
import ReactDOMServer from 'react-dom/server';
import ReactDOM from 'react-dom';
import App from './App';
import './index.css';

/* global Java */

window.serverRender = (comments) => {
        console.log(comments[0].author);
        var data = Java.from(comments);
        console.log(data[0]);
        return ReactDOMServer.renderToString(<App data={data} />);
};

window.clientRender = (comments) => {
        comments = comments || [];
        ReactDOM.render(<App data={comments} />, document.getElementById('root'));
}

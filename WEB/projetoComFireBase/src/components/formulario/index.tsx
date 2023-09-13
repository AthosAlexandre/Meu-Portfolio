import React, { useState, ChangeEvent, FormEvent } from 'react';
import { Link } from 'react-router-dom';

interface LoginFormProps {
    onSubmit: (email: string, senha: string) => void;
    buttonText: string;
    buttonText2: string;
    logarOuCadastrar: string;
}

function formulario(props: LoginFormProps) {
    const [email, setEmail] = useState('');
    const [senha, setSenha] = useState('');

    function handleEmailChange(event: ChangeEvent<HTMLInputElement>) {
        setEmail(event.target.value);
    }

    function handleSenhaChange(event: ChangeEvent<HTMLInputElement>) {
        setSenha(event.target.value);
    }

    function handleSubmit(event: FormEvent) {
        event.preventDefault();
        props.onSubmit(email, senha);
    }

    return (
        <>
            <form onSubmit={handleSubmit} className='progress-bar w-75'>
                <div className="form-floating mb-3">
                    <input type="email" className="form-control" value={email} onChange={handleEmailChange} id="floatingInput" placeholder="name@example.com" />
                    <label htmlFor="floatingInput">Email address</label>
                </div>

                <div className="form-floating">
                    <input type="password" value={senha} onChange={handleSenhaChange} className="form-control" id="floatingPassword" placeholder="Password"/>
                    <label htmlFor="floatingPassword">Password</label>
                </div>

                <div className="mb-3 mt-2 d-flex justify-content-between">
                    <button type="submit" className="btn btn-primary">{props.buttonText}</button>
                    <Link to={props.logarOuCadastrar} className="btn-primary">{props.buttonText2}</Link>
                </div>
            </form>

        </>
    )
}

export default formulario
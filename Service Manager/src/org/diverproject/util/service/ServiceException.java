package org.diverproject.util.service;

import org.diverproject.util.UtilException;

/**
 * <h1>Exception para Servi�o</h1>
 *
 * <p>Esse tipo de exce��o � como uma outra qualquer, ou seja, gera TryCatch obrigat�rio.
 * � utilizado garantir que determinados procedimentos n�o falhem causado danos ao sistema.
 * Quando detectado exce��es desse tipo a thread que gerou ele ser� interrompido.</p>
 *
 * @see AsckarynException
 *
 * @author Andrew
 */

public class ServiceException extends UtilException
{
	/**
	 * N�mero de serializa��o desse tipo de exce��o.
	 */
	private static final long serialVersionUID = 2926428005702877844L;

	/**
	 * Constr�i uma nova exce��o Asckaryn de tratamento n�o obrigat�rio para servi�os.
	 * @param message mensagem que ser� exibida quando a exce��o for gerada.
	 */

	public ServiceException(String message)
	{
		super(message);
	}

	/**
	 * Constr�i uma nova exce��o Asckaryn de tratamento n�o obrigat�rio para servi�os.
	 * @param format string contendo o formato da mensagem que ser� exibida.
	 * @param args argumentos respectivos a formata��o da mensagem.
	 */

	public ServiceException(String format, Object... args)
	{
		super(format, args);
	}

	/**
	 * Constr�i uma nova exce��o de utilit�rio sendo necess�rio definir a exce��o.
	 * Nesse caso ir� construir uma nova exce��o a partir de uma exce��o existente.
	 * Utilizando a mensagem dessa exce��o como mensagem desta.
	 * @param e exce��o do qual ser� considerada para criar uma nova.
	 */

	public ServiceException(Exception e)
	{
		super(e);
	}

	/**
	 * Constr�i uma nova exce��o Asckaryn de tratamento n�o obrigat�rio para servi�os.
	 * Nesse caso a mensagem ser� usada de uma exce��o j� criada, por�m permite adicionar
	 * um determinado conte�do extra como dados que ser� posicionado entre aspas.
	 * @param e exce��o para usar a mensagem armazenada no mesmo como exce��o.
	 * @param format string contendo o formato do conte�do extra.
	 * @param args argumentos respectivos a formata��o da mensagem.
	 */

	public ServiceException(Exception e, String format, Object... args)
	{
		super(e, format, args);
	}
}

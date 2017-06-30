package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	private String characterSet;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CharacterEncodingFilter init()");
		characterSet = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) 	throws IOException, ServletException {
		//��ó��(������ �����ϱ� ���� ó��: ��û ó����)
		System.out.println("CharacterEncodingFilter doFilter() - ��ó��");
		request.setCharacterEncoding(characterSet);
		//------------------------------------------------------------
		filterChain.doFilter(request, response);
		//------------------------------------------------------------
		//��ó��(������ ������ �Ŀ� ó��: ��û ó����, ������ ��������)
		System.out.println("CharacterEncodingFilter doFilter() - ��ó��");
	}

	@Override
	public void destroy() {
		System.out.println("CharacterEncodingFilter destroy()");
	}	
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.15
 * Generated at: 2024-10-01 23:31:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.alunos.cadastrobean;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/teixe/eclipse-workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/OlaMundo/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602884772000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1726095767979L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<title>Formulário</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("	body {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("		height: 100vh;\r\n");
      out.write("	\r\n");
      out.write("	}\r\n");
      out.write("	.conteudoTela {\r\n");
      out.write("		width: 550px;\r\n");
      out.write("		background-color: white;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 2px 6px 0px rgba(0, 0, 0, 0.15);\r\n");
      out.write("		\r\n");
      out.write("	\r\n");
      out.write("	}\r\n");
      out.write("	h1 {\r\n");
      out.write("		text-align:center;\r\n");
      out.write("		margin-bottom: 20px;\r\n");
      out.write("		font-size: 32px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.botoes {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: end;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	gap:10px;\r\n");
      out.write("	margin-top:20px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      org.alunos.Aluno a = null;
      a = (org.alunos.Aluno) _jspx_page_context.getAttribute("a", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (a == null){
        a = new org.alunos.Aluno();
        _jspx_page_context.setAttribute("a", a, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.alunos.AlunoDAO adao = null;
      adao = (org.alunos.AlunoDAO) _jspx_page_context.getAttribute("adao", jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      if (adao == null){
        adao = new org.alunos.AlunoDAO();
        _jspx_page_context.setAttribute("adao", adao, jakarta.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("a"), request);
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a = adao.consultar(a.idaluno)}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

	// titulo
	String tituloTela = "Novo cadastro de aluno";
	if (a.getIdaluno() > 0) {
		tituloTela = "Atualizar cadastro de aluno";
	} else {
		tituloTela = "Novo cadastro de aluno";
	}
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"conteudoTela\">\r\n");
      out.write("	\r\n");
      out.write("	<h1>");
      out.print( tituloTela );
      out.write("</h1>\r\n");
      out.write("	\r\n");
      out.write("	<form action=\"gravar.jsp\" method=\"post\" autocomplete=\"off\">\r\n");
      out.write("			  <input type=\"hidden\" name=\"idaluno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.idaluno}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			    <label for=\"inputNome\">Nome</label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"inputNome\" name=\"nome\" placeholder=\"Digite o nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.nome}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			    <label for=\"inputTelefone\">Telefone</label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"inputTelefone\" name=\"telefone\" placeholder=\"Digite o telefone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.telefone}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required maxlength=\"11\">\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			    <label for=\"inputEmail\">E-mail</label>\r\n");
      out.write("			    <input type=\"email\" class=\"form-control\" id=\"inputEmail\" name=\"email\" placeholder=\"Digite o e-mail\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.email}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"form-group\">\r\n");
      out.write("			    <label for=\"inputCurso\">Curso</label>\r\n");
      out.write("			    <input type=\"text\" class=\"form-control\" id=\"inputCurso\" name=\"curso\" placeholder=\"Digite o curso\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${a.curso}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("			  </div>\r\n");
      out.write("			  <div class=\"botoes\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-primary\" onclick=\"window.location.href='index.jsp';\">\r\n");
      out.write("					Página inicial\r\n");
      out.write("				</button>\r\n");
      out.write("			  	<button type=\"submit\" class=\"btn btn-primary\">Salvar cadastro</button>\r\n");
      out.write("		\r\n");
      out.write("		</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.15
 * Generated at: 2024-09-30 01:45:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.alunos.cadastro;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import org.alunos.Aluno;
import org.alunos.AlunoDAO;
import org.libertas.Pessoa;
import org.libertas.PessoaDAO;

public final class listar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.alunos.AlunoDAO");
    _jspx_imports_classes.add("org.libertas.PessoaDAO");
    _jspx_imports_classes.add("org.alunos.Aluno");
    _jspx_imports_classes.add("org.libertas.Pessoa");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Listar</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    h1 {\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    margin-bottom:10px;\r\n");
      out.write("    font-size: 32px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .botoesTopo {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: end;\r\n");
      out.write("    align-items:center;\r\n");
      out.write("    gap:10px;\r\n");
      out.write("    margin-bottom:20px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    .conteudoPagina {\r\n");
      out.write("    margin: 20px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"conteudoPagina\">\r\n");
      out.write("		<h1>Cadastro de alunos</h1>\r\n");
      out.write("		<div class=\"botoesTopo\">\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-outline-primary\" onclick=\"window.location.href='index.jsp';\">\r\n");
      out.write("				Página inicial\r\n");
      out.write("			</button>\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-primary\" onclick=\"window.location.href='formulario.jsp?id=0';\">\r\n");
      out.write("				Novo aluno\r\n");
      out.write("			</button>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<table class=\"table table-striped\">\r\n");
      out.write("			<th>Matrícula</th>\r\n");
      out.write("			<th>Nome</th>\r\n");
      out.write("			<th>Telefone</th>\r\n");
      out.write("			<th>Email</th>\r\n");
      out.write("			<th>Curso</th>\r\n");
      out.write("			<th></th>\r\n");
      out.write("			<th></th>\r\n");
      out.write("			\r\n");
      out.write("			");

				AlunoDAO dao = new AlunoDAO();
				for (Aluno a : dao.listar()) {
					out.print("<tr>");
					out.print("<td>" + a.getIdaluno() + "</td>");
					out.print("<td>" + a.getNome() + "</td>");
					out.print("<td>" + a.getTelefone() + "</td>");
					out.print("<td>" + a.getEmail() + "</td>");
					out.print("<td>" + a.getCurso() + "</td>");
					out.print("<td>");
					out.print("<a href='formulario.jsp?id=" + a.getIdaluno() + "' class='btn btn-primary'>");
					out.print("<i class='bi bi-pencil'></i></a>");
					out.print("</td>");
	
					out.print("<td>");
					out.print("<a href='excluir.jsp?id=" + a.getIdaluno() + "' class='btn btn-danger'>");
					out.print("<i class='bi bi-trash'></i></a>");
					out.print("</td>");
				}
			
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
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

<!-- Footer contendo javascript -->



<script
    src="https://code.jquery.com/jquery-3.3.1.min.js"
    
></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.10/jquery.mask.js"></script>
<script
    src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"
></script>
<script
    src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"
></script>

<script src="${pageContext.request.contextPath}/js/main.js"></script>
<script src="${pageContext.request.contextPath}/js/cep.js"></script>
<script src="${pageContext.request.contextPath}/js/mask.js"></script>


<c:if test="${!empty msgServlet}">        

    <!-- The Modal -->
    <div id="MyModal" class="modalX">

        <!-- Modal content -->

        <div class="modalX-content">

            <p> <c:out value="${msgServlet}"/></p>
            <div class="btn-right"><button id="closeX" class="cancel">Ok</button></div>

        </div>
    </div>

</c:if>




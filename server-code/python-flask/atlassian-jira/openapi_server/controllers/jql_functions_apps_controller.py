import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.jql_function_precomputation_update_request_bean import JqlFunctionPrecomputationUpdateRequestBean  # noqa: E501
from openapi_server.models.page_bean_jql_function_precomputation_bean import PageBeanJqlFunctionPrecomputationBean  # noqa: E501
from openapi_server import util


def get_precomputations(function_key=None, start_at=None, max_results=None, order_by=None, filter=None):  # noqa: E501
    """Get precomputations (apps)

    Returns the list of a function&#39;s precomputations along with information about when they were created, updated, and last used. Each precomputation has a &#x60;value&#x60; \\- the JQL fragment to replace the custom function clause with.  **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions. # noqa: E501

    :param function_key: The function key in format:   *  Forge: &#x60;ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]&#x60;.  *  Connect: &#x60;[App key]__[Module key]&#x60;.
    :type function_key: List[str]
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param order_by: Not supported yet.
    :type order_by: str
    :param filter: Not supported yet.
    :type filter: str

    :rtype: Union[PageBeanJqlFunctionPrecomputationBean, Tuple[PageBeanJqlFunctionPrecomputationBean, int], Tuple[PageBeanJqlFunctionPrecomputationBean, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_precomputations(jql_function_precomputation_update_request_bean):  # noqa: E501
    """Update precomputations (apps)

    Update the precomputation value of a function created by a Forge/Connect app.  **[Permissions](#permissions) required:** An API for apps to update their own precomputations. # noqa: E501

    :param jql_function_precomputation_update_request_bean: 
    :type jql_function_precomputation_update_request_bean: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        jql_function_precomputation_update_request_bean = JqlFunctionPrecomputationUpdateRequestBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

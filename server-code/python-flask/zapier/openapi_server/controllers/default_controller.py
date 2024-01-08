import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.execute_request import ExecuteRequest  # noqa: E501
from openapi_server.models.execute_response import ExecuteResponse  # noqa: E501
from openapi_server.models.exposed_action_response_schema import ExposedActionResponseSchema  # noqa: E501
from openapi_server import util


def check():  # noqa: E501
    """Check

    Test that the API and auth are working. # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def execute_app_action_endpoint(exposed_app_action_id, execute_request):  # noqa: E501
    """Execute App Action Endpoint

    Give us a plain english description of exact action you want to do. There should be dynamically generated documentation for this endpoint for each action that is exposed. # noqa: E501

    :param exposed_app_action_id: 
    :type exposed_app_action_id: str
    :param execute_request: 
    :type execute_request: dict | bytes

    :rtype: Union[ExecuteResponse, Tuple[ExecuteResponse, int], Tuple[ExecuteResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        execute_request = ExecuteRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_configuration_link():  # noqa: E501
    """Get Configuration Link

    Provides a link to configure more actions. Alternatively, searching through apps and actions will provide more specific configuration links. # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_execution_log_endpoint(execution_log_id):  # noqa: E501
    """Get Execution Log Endpoint

    Get the execution log for a given execution log id. # noqa: E501

    :param execution_log_id: 
    :type execution_log_id: str

    :rtype: Union[ExecuteResponse, Tuple[ExecuteResponse, int], Tuple[ExecuteResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_exposed_actions():  # noqa: E501
    """List Exposed Actions

    List all the currently exposed actions for the given account. # noqa: E501


    :rtype: Union[ExposedActionResponseSchema, Tuple[ExposedActionResponseSchema, int], Tuple[ExposedActionResponseSchema, int, Dict[str, str]]
    """
    return 'do some magic!'

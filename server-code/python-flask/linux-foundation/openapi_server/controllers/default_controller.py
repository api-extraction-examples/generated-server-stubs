import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.health import Health  # noqa: E501
from openapi_server.models.policy_reset_input import PolicyResetInput  # noqa: E501
from openapi_server.models.policy_tag_input import PolicyTagInput  # noqa: E501
from openapi_server import util


def expense_action(action, report_id):  # noqa: E501
    """Expense Action

    approves or rejects expense report # noqa: E501

    :param action: 
    :type action: str
    :param report_id: 
    :type report_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def health_check():  # noqa: E501
    """Get API Health Status

     # noqa: E501


    :rtype: Union[Health, Tuple[Health, int], Tuple[Health, int, Dict[str, str]]
    """
    return 'do some magic!'


def reset_policy(body):  # noqa: E501
    """Reset Policy

    Reset an existing policy to match with templatePolicy # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PolicyResetInput.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def tag_policy(body):  # noqa: E501
    """Tag Policy

    Tag adds a tag to the policy # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PolicyTagInput.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

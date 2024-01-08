import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_reimbursement_request import CreateReimbursementRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.policy_update_input import PolicyUpdateInput  # noqa: E501
from openapi_server import util


def create_reimbursement(project_id, body):  # noqa: E501
    """Create Reimbursement

    Create a new Reimbursement policy # noqa: E501

    :param project_id: 
    :type project_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = CreateReimbursementRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_reimbursement(project_id, body):  # noqa: E501
    """Update Reimbursement

    Update an existing Reimbursement policy # noqa: E501

    :param project_id: 
    :type project_id: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PolicyUpdateInput.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.beta_tester_invitation_create_request import BetaTesterInvitationCreateRequest  # noqa: E501
from openapi_server.models.beta_tester_invitation_response import BetaTesterInvitationResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def beta_tester_invitations_create_instance(beta_tester_invitation_create_request):  # noqa: E501
    """beta_tester_invitations_create_instance

     # noqa: E501

    :param beta_tester_invitation_create_request: BetaTesterInvitation representation
    :type beta_tester_invitation_create_request: dict | bytes

    :rtype: Union[BetaTesterInvitationResponse, Tuple[BetaTesterInvitationResponse, int], Tuple[BetaTesterInvitationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        beta_tester_invitation_create_request = BetaTesterInvitationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

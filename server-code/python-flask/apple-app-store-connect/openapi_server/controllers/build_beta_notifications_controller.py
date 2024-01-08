import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.build_beta_notification_create_request import BuildBetaNotificationCreateRequest  # noqa: E501
from openapi_server.models.build_beta_notification_response import BuildBetaNotificationResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def build_beta_notifications_create_instance(build_beta_notification_create_request):  # noqa: E501
    """build_beta_notifications_create_instance

     # noqa: E501

    :param build_beta_notification_create_request: BuildBetaNotification representation
    :type build_beta_notification_create_request: dict | bytes

    :rtype: Union[BuildBetaNotificationResponse, Tuple[BuildBetaNotificationResponse, int], Tuple[BuildBetaNotificationResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build_beta_notification_create_request = BuildBetaNotificationCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

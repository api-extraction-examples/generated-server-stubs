import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.name_id_pair import NameIdPair  # noqa: E501
from openapi_server.models.notification_level import NotificationLevel  # noqa: E501
from openapi_server.models.notification_result_dto import NotificationResultDto  # noqa: E501
from openapi_server.models.notification_type_info import NotificationTypeInfo  # noqa: E501
from openapi_server.models.notifications_summary_dto import NotificationsSummaryDto  # noqa: E501
from openapi_server import util


def create_admin_notification(url=None, level=None, name=None, description=None):  # noqa: E501
    """Sends a notification to all admins.

     # noqa: E501

    :param url: The URL of the notification.
    :type url: str
    :param level: The level of the notification.
    :type level: dict | bytes
    :param name: The name of the notification.
    :type name: str
    :param description: The description of the notification.
    :type description: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        level =  NotificationLevel.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_notification_services():  # noqa: E501
    """Gets notification services.

     # noqa: E501


    :rtype: Union[List[NameIdPair], Tuple[List[NameIdPair], int], Tuple[List[NameIdPair], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notification_types():  # noqa: E501
    """Gets notification types.

     # noqa: E501


    :rtype: Union[List[NotificationTypeInfo], Tuple[List[NotificationTypeInfo], int], Tuple[List[NotificationTypeInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notifications(user_id):  # noqa: E501
    """Gets a user&#39;s notifications.

     # noqa: E501

    :param user_id: 
    :type user_id: str

    :rtype: Union[NotificationResultDto, Tuple[NotificationResultDto, int], Tuple[NotificationResultDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notifications_summary(user_id):  # noqa: E501
    """Gets a user&#39;s notification summary.

     # noqa: E501

    :param user_id: 
    :type user_id: str

    :rtype: Union[NotificationsSummaryDto, Tuple[NotificationsSummaryDto, int], Tuple[NotificationsSummaryDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_read(user_id):  # noqa: E501
    """Sets notifications as read.

     # noqa: E501

    :param user_id: 
    :type user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_unread(user_id):  # noqa: E501
    """Sets notifications as unread.

     # noqa: E501

    :param user_id: 
    :type user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'

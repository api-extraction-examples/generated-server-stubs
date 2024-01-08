import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_notifications_details import AddNotificationsDetails  # noqa: E501
from openapi_server.models.create_notification_scheme_details import CreateNotificationSchemeDetails  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.notification_scheme import NotificationScheme  # noqa: E501
from openapi_server.models.notification_scheme_id import NotificationSchemeId  # noqa: E501
from openapi_server.models.page_bean_notification_scheme import PageBeanNotificationScheme  # noqa: E501
from openapi_server.models.page_bean_notification_scheme_and_project_mapping_json_bean import PageBeanNotificationSchemeAndProjectMappingJsonBean  # noqa: E501
from openapi_server.models.update_notification_scheme_details import UpdateNotificationSchemeDetails  # noqa: E501
from openapi_server import util


def add_notifications(id, add_notifications_details):  # noqa: E501
    """Add notifications to notification scheme

    Adds notifications to a notification scheme. You can add up to 1000 notifications per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the notification scheme.
    :type id: str
    :param add_notifications_details: 
    :type add_notifications_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_notifications_details = AddNotificationsDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_notification_scheme(create_notification_scheme_details):  # noqa: E501
    """Create notification scheme

    Creates a notification scheme with notifications. You can create up to 1000 notifications per request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param create_notification_scheme_details: 
    :type create_notification_scheme_details: dict | bytes

    :rtype: Union[NotificationSchemeId, Tuple[NotificationSchemeId, int], Tuple[NotificationSchemeId, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_notification_scheme_details = CreateNotificationSchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_notification_scheme(notification_scheme_id):  # noqa: E501
    """Delete notification scheme

    Deletes a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param notification_scheme_id: The ID of the notification scheme.
    :type notification_scheme_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notification_scheme(id, expand=None):  # noqa: E501
    """Get notification scheme

    Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme. # noqa: E501

    :param id: The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs.
    :type id: int
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event  *  &#x60;user&#x60; Returns information about any users assigned to receive an event
    :type expand: str

    :rtype: Union[NotificationScheme, Tuple[NotificationScheme, int], Tuple[NotificationScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notification_scheme_to_project_mappings(start_at=None, max_results=None, notification_scheme_id=None, project_id=None):  # noqa: E501
    """Get projects using notification schemes paginated

    Returns a [paginated](#pagination) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don&#39;t provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don&#39;t have a concept of a default notification scheme. The mappings are ordered by projectId.  **[Permissions](#permissions) required:** Permission to access Jira. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param notification_scheme_id: The list of notifications scheme IDs to be filtered out
    :type notification_scheme_id: List[str]
    :param project_id: The list of project IDs to be filtered out
    :type project_id: List[str]

    :rtype: Union[PageBeanNotificationSchemeAndProjectMappingJsonBean, Tuple[PageBeanNotificationSchemeAndProjectMappingJsonBean, int], Tuple[PageBeanNotificationSchemeAndProjectMappingJsonBean, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_notification_schemes(start_at=None, max_results=None, id=None, project_id=None, only_default=None, expand=None):  # noqa: E501
    """Get notification schemes paginated

    Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: str
    :param max_results: The maximum number of items to return per page.
    :type max_results: str
    :param id: The list of notification schemes IDs to be filtered by
    :type id: List[str]
    :param project_id: The list of projects IDs to be filtered by
    :type project_id: List[str]
    :param only_default: When set to true, returns only the default notification scheme. If you provide project IDs not associated with the default, returns an empty page. The default value is false.
    :type only_default: bool
    :param expand: Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event  *  &#x60;user&#x60; Returns information about any users assigned to receive an event
    :type expand: str

    :rtype: Union[PageBeanNotificationScheme, Tuple[PageBeanNotificationScheme, int], Tuple[PageBeanNotificationScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_notification_from_notification_scheme(notification_scheme_id, notification_id):  # noqa: E501
    """Remove notification from notification scheme

    Removes a notification from a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param notification_scheme_id: The ID of the notification scheme.
    :type notification_scheme_id: str
    :param notification_id: The ID of the notification.
    :type notification_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_notification_scheme(id, update_notification_scheme_details):  # noqa: E501
    """Update notification scheme

    Updates a notification scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param id: The ID of the notification scheme.
    :type id: str
    :param update_notification_scheme_details: 
    :type update_notification_scheme_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_notification_scheme_details = UpdateNotificationSchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

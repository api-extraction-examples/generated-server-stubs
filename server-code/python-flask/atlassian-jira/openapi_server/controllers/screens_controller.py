import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.page_bean_screen import PageBeanScreen  # noqa: E501
from openapi_server.models.page_bean_screen_with_tab import PageBeanScreenWithTab  # noqa: E501
from openapi_server.models.screen import Screen  # noqa: E501
from openapi_server.models.screen_details import ScreenDetails  # noqa: E501
from openapi_server.models.screenable_field import ScreenableField  # noqa: E501
from openapi_server.models.update_screen_details import UpdateScreenDetails  # noqa: E501
from openapi_server import util


def add_field_to_default_screen(field_id):  # noqa: E501
    """Add field to default screen

    Adds a field to the default tab of the default screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the field.
    :type field_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_screen(screen_details):  # noqa: E501
    """Create screen

    Creates a screen with a default field tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_details: 
    :type screen_details: dict | bytes

    :rtype: Union[Screen, Tuple[Screen, int], Tuple[Screen, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        screen_details = ScreenDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_screen(screen_id):  # noqa: E501
    """Delete screen

    Deletes a screen. A screen cannot be deleted if it is used in a screen scheme, workflow, or workflow draft.  Only screens used in classic projects can be deleted. # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_available_screen_fields(screen_id):  # noqa: E501
    """Get available screen fields

    Returns the fields that can be added to a tab on a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int

    :rtype: Union[List[ScreenableField], Tuple[List[ScreenableField], int], Tuple[List[ScreenableField], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_screens(start_at=None, max_results=None, id=None, query_string=None, scope=None, order_by=None):  # noqa: E501
    """Get screens

    Returns a [paginated](#pagination) list of all screens or those specified by one or more screen IDs.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param id: The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[int]
    :param query_string: String used to perform a case-insensitive partial match with screen name.
    :type query_string: str
    :param scope: The scope filter string. To filter by multiple scope, provide an ampersand-separated list. For example, &#x60;scope&#x3D;GLOBAL&amp;scope&#x3D;PROJECT&#x60;.
    :type scope: List[str]
    :param order_by: [Order](#ordering) the results by a field:   *  &#x60;id&#x60; Sorts by screen ID.  *  &#x60;name&#x60; Sorts by screen name.
    :type order_by: str

    :rtype: Union[PageBeanScreen, Tuple[PageBeanScreen, int], Tuple[PageBeanScreen, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_screens_for_field(field_id, start_at=None, max_results=None, expand=None):  # noqa: E501
    """Get screens for a field

    Returns a [paginated](#pagination) list of the screens a field is used in.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the field to return screens for.
    :type field_id: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param expand: Use [expand](#expansion) to include additional information about screens in the response. This parameter accepts &#x60;tab&#x60; which returns details about the screen tabs the field is used in.
    :type expand: str

    :rtype: Union[PageBeanScreenWithTab, Tuple[PageBeanScreenWithTab, int], Tuple[PageBeanScreenWithTab, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_screen(screen_id, update_screen_details):  # noqa: E501
    """Update screen

    Updates a screen. Only screens used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param update_screen_details: 
    :type update_screen_details: dict | bytes

    :rtype: Union[Screen, Tuple[Screen, int], Tuple[Screen, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_screen_details = UpdateScreenDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.page_bean_screen_scheme import PageBeanScreenScheme  # noqa: E501
from openapi_server.models.screen_scheme_details import ScreenSchemeDetails  # noqa: E501
from openapi_server.models.screen_scheme_id import ScreenSchemeId  # noqa: E501
from openapi_server.models.update_screen_scheme_details import UpdateScreenSchemeDetails  # noqa: E501
from openapi_server import util


def create_screen_scheme(screen_scheme_details):  # noqa: E501
    """Create screen scheme

    Creates a screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_scheme_details: 
    :type screen_scheme_details: dict | bytes

    :rtype: Union[ScreenSchemeId, Tuple[ScreenSchemeId, int], Tuple[ScreenSchemeId, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        screen_scheme_details = ScreenSchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_screen_scheme(screen_scheme_id):  # noqa: E501
    """Delete screen scheme

    Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.  Only screens schemes used in classic projects can be deleted.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_scheme_id: The ID of the screen scheme.
    :type screen_scheme_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_screen_schemes(start_at=None, max_results=None, id=None, expand=None, query_string=None, order_by=None):  # noqa: E501
    """Get screen schemes

    Returns a [paginated](#pagination) list of screen schemes.  Only screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param id: The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
    :type id: List[int]
    :param expand: Use [expand](#expansion) include additional information in the response. This parameter accepts &#x60;issueTypeScreenSchemes&#x60; that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to.
    :type expand: str
    :param query_string: String used to perform a case-insensitive partial match with screen scheme name.
    :type query_string: str
    :param order_by: [Order](#ordering) the results by a field:   *  &#x60;id&#x60; Sorts by screen scheme ID.  *  &#x60;name&#x60; Sorts by screen scheme name.
    :type order_by: str

    :rtype: Union[PageBeanScreenScheme, Tuple[PageBeanScreenScheme, int], Tuple[PageBeanScreenScheme, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_screen_scheme(screen_scheme_id, update_screen_scheme_details):  # noqa: E501
    """Update screen scheme

    Updates a screen scheme. Only screen schemes used in classic projects can be updated.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_scheme_id: The ID of the screen scheme.
    :type screen_scheme_id: str
    :param update_screen_scheme_details: The screen scheme update details.
    :type update_screen_scheme_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_screen_scheme_details = UpdateScreenSchemeDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

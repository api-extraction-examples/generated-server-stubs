import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_field_bean import AddFieldBean  # noqa: E501
from openapi_server.models.move_field_bean import MoveFieldBean  # noqa: E501
from openapi_server.models.screenable_field import ScreenableField  # noqa: E501
from openapi_server import util


def add_screen_tab_field(screen_id, tab_id, add_field_bean):  # noqa: E501
    """Add screen tab field

    Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int
    :param add_field_bean: 
    :type add_field_bean: dict | bytes

    :rtype: Union[ScreenableField, Tuple[ScreenableField, int], Tuple[ScreenableField, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_field_bean = AddFieldBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_all_screen_tab_fields(screen_id, tab_id, project_key=None):  # noqa: E501
    """Get all screen tab fields

    Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme. # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int
    :param project_key: The key of the project.
    :type project_key: str

    :rtype: Union[List[ScreenableField], Tuple[List[ScreenableField], int], Tuple[List[ScreenableField], int, Dict[str, str]]
    """
    return 'do some magic!'


def move_screen_tab_field(screen_id, tab_id, id, move_field_bean):  # noqa: E501
    """Move screen tab field

    Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int
    :param id: The ID of the field.
    :type id: str
    :param move_field_bean: 
    :type move_field_bean: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        move_field_bean = MoveFieldBean.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def remove_screen_tab_field(screen_id, tab_id, id):  # noqa: E501
    """Remove screen tab field

    Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int
    :param id: The ID of the field.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'

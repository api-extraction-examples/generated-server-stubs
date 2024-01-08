import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.screenable_tab import ScreenableTab  # noqa: E501
from openapi_server import util


def add_screen_tab(screen_id, screenable_tab):  # noqa: E501
    """Create screen tab

    Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param screenable_tab: 
    :type screenable_tab: dict | bytes

    :rtype: Union[ScreenableTab, Tuple[ScreenableTab, int], Tuple[ScreenableTab, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        screenable_tab = ScreenableTab.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_screen_tab(screen_id, tab_id):  # noqa: E501
    """Delete screen tab

    Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_screen_tabs(screen_id, project_key=None):  # noqa: E501
    """Get all screen tabs

    Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme. # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param project_key: The key of the project.
    :type project_key: str

    :rtype: Union[List[ScreenableTab], Tuple[List[ScreenableTab], int], Tuple[List[ScreenableTab], int, Dict[str, str]]
    """
    return 'do some magic!'


def move_screen_tab(screen_id, tab_id, pos):  # noqa: E501
    """Move screen tab

    Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int
    :param pos: The position of tab. The base index is 0.
    :type pos: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def rename_screen_tab(screen_id, tab_id, screenable_tab):  # noqa: E501
    """Update screen tab

    Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param screen_id: The ID of the screen.
    :type screen_id: int
    :param tab_id: The ID of the screen tab.
    :type tab_id: int
    :param screenable_tab: 
    :type screenable_tab: dict | bytes

    :rtype: Union[ScreenableTab, Tuple[ScreenableTab, int], Tuple[ScreenableTab, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        screenable_tab = ScreenableTab.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

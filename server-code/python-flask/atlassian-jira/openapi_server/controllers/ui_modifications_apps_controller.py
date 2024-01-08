import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_ui_modification_details import CreateUiModificationDetails  # noqa: E501
from openapi_server.models.page_bean_ui_modification_details import PageBeanUiModificationDetails  # noqa: E501
from openapi_server.models.ui_modification_identifiers import UiModificationIdentifiers  # noqa: E501
from openapi_server.models.update_ui_modification_details import UpdateUiModificationDetails  # noqa: E501
from openapi_server import util


def create_ui_modification(create_ui_modification_details):  # noqa: E501
    """Create UI modification

    Creates a UI modification. UI modification can only be created by Forge apps.  Each app can define up to 100 UI modifications. Each UI modification can define up to 1000 contexts.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts. # noqa: E501

    :param create_ui_modification_details: Details of the UI modification.
    :type create_ui_modification_details: dict | bytes

    :rtype: Union[UiModificationIdentifiers, Tuple[UiModificationIdentifiers, int], Tuple[UiModificationIdentifiers, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_ui_modification_details = CreateUiModificationDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_ui_modification(ui_modification_id):  # noqa: E501
    """Delete UI modification

    Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param ui_modification_id: The ID of the UI modification.
    :type ui_modification_id: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ui_modifications(start_at=None, max_results=None, expand=None):  # noqa: E501
    """Get UI modifications

    Gets UI modifications. UI modifications can only be retrieved by Forge apps.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param expand: Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;data&#x60; Returns UI modification data.  *  &#x60;contexts&#x60; Returns UI modification contexts.
    :type expand: str

    :rtype: Union[PageBeanUiModificationDetails, Tuple[PageBeanUiModificationDetails, int], Tuple[PageBeanUiModificationDetails, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_ui_modification(ui_modification_id, update_ui_modification_details):  # noqa: E501
    """Update UI modification

    Updates a UI modification. UI modification can only be updated by Forge apps.  Each UI modification can define up to 1000 contexts.  **[Permissions](#permissions) required:**   *  *None* if the UI modification is created without contexts.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts. # noqa: E501

    :param ui_modification_id: The ID of the UI modification.
    :type ui_modification_id: str
    :param update_ui_modification_details: Details of the UI modification.
    :type update_ui_modification_details: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_ui_modification_details = UpdateUiModificationDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

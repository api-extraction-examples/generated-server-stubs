import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.add_virtual_folder_dto import AddVirtualFolderDto  # noqa: E501
from openapi_server.models.media_path_dto import MediaPathDto  # noqa: E501
from openapi_server.models.media_path_info import MediaPathInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.update_library_options_dto import UpdateLibraryOptionsDto  # noqa: E501
from openapi_server.models.virtual_folder_info import VirtualFolderInfo  # noqa: E501
from openapi_server import util


def add_media_path(media_path_dto, refresh_library=None):  # noqa: E501
    """Add a media path to a library.

     # noqa: E501

    :param media_path_dto: The media path dto.
    :type media_path_dto: dict | bytes
    :param refresh_library: Whether to refresh the library.
    :type refresh_library: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        media_path_dto = MediaPathDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_virtual_folder(name=None, collection_type=None, paths=None, refresh_library=None, add_virtual_folder_dto=None):  # noqa: E501
    """Adds a virtual folder.

     # noqa: E501

    :param name: The name of the virtual folder.
    :type name: str
    :param collection_type: The type of the collection.
    :type collection_type: str
    :param paths: The paths of the virtual folder.
    :type paths: List[str]
    :param refresh_library: Whether to refresh the library.
    :type refresh_library: bool
    :param add_virtual_folder_dto: The library options.
    :type add_virtual_folder_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        add_virtual_folder_dto = AddVirtualFolderDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_virtual_folders():  # noqa: E501
    """Gets all virtual folders.

     # noqa: E501


    :rtype: Union[List[VirtualFolderInfo], Tuple[List[VirtualFolderInfo], int], Tuple[List[VirtualFolderInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_media_path(name=None, path=None, refresh_library=None):  # noqa: E501
    """Remove a media path.

     # noqa: E501

    :param name: The name of the library.
    :type name: str
    :param path: The path to remove.
    :type path: str
    :param refresh_library: Whether to refresh the library.
    :type refresh_library: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_virtual_folder(name=None, refresh_library=None):  # noqa: E501
    """Removes a virtual folder.

     # noqa: E501

    :param name: The name of the folder.
    :type name: str
    :param refresh_library: Whether to refresh the library.
    :type refresh_library: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def rename_virtual_folder(name=None, new_name=None, refresh_library=None):  # noqa: E501
    """Renames a virtual folder.

     # noqa: E501

    :param name: The name of the virtual folder.
    :type name: str
    :param new_name: The new name.
    :type new_name: str
    :param refresh_library: Whether to refresh the library.
    :type refresh_library: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_library_options(update_library_options_dto=None):  # noqa: E501
    """Update library options.

     # noqa: E501

    :param update_library_options_dto: The library name and options.
    :type update_library_options_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        update_library_options_dto = UpdateLibraryOptionsDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_media_path(name=None, media_path_info=None):  # noqa: E501
    """Updates a media path.

     # noqa: E501

    :param name: The name of the library.
    :type name: str
    :param media_path_info: The path info.
    :type media_path_info: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        media_path_info = MediaPathInfo.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.default_directory_browser_info_dto import DefaultDirectoryBrowserInfoDto  # noqa: E501
from openapi_server.models.file_system_entry_info import FileSystemEntryInfo  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.validate_path_dto import ValidatePathDto  # noqa: E501
from openapi_server import util


def get_default_directory_browser():  # noqa: E501
    """Get Default directory browser.

     # noqa: E501


    :rtype: Union[DefaultDirectoryBrowserInfoDto, Tuple[DefaultDirectoryBrowserInfoDto, int], Tuple[DefaultDirectoryBrowserInfoDto, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_directory_contents(path, include_files=None, include_directories=None):  # noqa: E501
    """Gets the contents of a given directory in the file system.

     # noqa: E501

    :param path: The path.
    :type path: str
    :param include_files: An optional filter to include or exclude files from the results. true/false.
    :type include_files: bool
    :param include_directories: An optional filter to include or exclude folders from the results. true/false.
    :type include_directories: bool

    :rtype: Union[List[FileSystemEntryInfo], Tuple[List[FileSystemEntryInfo], int], Tuple[List[FileSystemEntryInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_drives():  # noqa: E501
    """Gets available drives from the server&#39;s file system.

     # noqa: E501


    :rtype: Union[List[FileSystemEntryInfo], Tuple[List[FileSystemEntryInfo], int], Tuple[List[FileSystemEntryInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_network_shares():  # noqa: E501
    """Gets network paths.

     # noqa: E501


    :rtype: Union[List[FileSystemEntryInfo], Tuple[List[FileSystemEntryInfo], int], Tuple[List[FileSystemEntryInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_parent_path(path):  # noqa: E501
    """Gets the parent path of a given path.

     # noqa: E501

    :param path: The path.
    :type path: str

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def validate_path(validate_path_dto):  # noqa: E501
    """Validates path.

     # noqa: E501

    :param validate_path_dto: Validate request object.
    :type validate_path_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        validate_path_dto = ValidatePathDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

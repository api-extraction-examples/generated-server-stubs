import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.file import File  # noqa: E501
from openapi_server import util


def download_file_by_id(vault_uuid, item_uuid, file_uuid):  # noqa: E501
    """Get the content of a File

     # noqa: E501

    :param vault_uuid: The UUID of the Vault the item is in
    :type vault_uuid: str
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item the File is in
    :type item_uuid: str
    :type item_uuid: str
    :param file_uuid: UUID of the file to get content from
    :type file_uuid: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_details_of_file_by_id(vault_uuid, item_uuid, file_uuid, inline_files=None):  # noqa: E501
    """Get the details of a File

     # noqa: E501

    :param vault_uuid: The UUID of the Vault to fetch Item from
    :type vault_uuid: str
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item to fetch File from
    :type item_uuid: str
    :type item_uuid: str
    :param file_uuid: The UUID of the File to fetch
    :type file_uuid: str
    :type file_uuid: str
    :param inline_files: Tells server to return the base64-encoded file contents in the response.
    :type inline_files: bool

    :rtype: Union[File, Tuple[File, int], Tuple[File, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_item_files(vault_uuid, item_uuid, inline_files=None):  # noqa: E501
    """Get all the files inside an Item

     # noqa: E501

    :param vault_uuid: The UUID of the Vault to fetch Items from
    :type vault_uuid: str
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item to fetch files from
    :type item_uuid: str
    :type item_uuid: str
    :param inline_files: Tells server to return the base64-encoded file contents in the response.
    :type inline_files: bool

    :rtype: Union[List[File], Tuple[List[File], int], Tuple[List[File], int, Dict[str, str]]
    """
    return 'do some magic!'

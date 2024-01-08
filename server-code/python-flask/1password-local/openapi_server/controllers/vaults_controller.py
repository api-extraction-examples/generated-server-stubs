import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.vault import Vault  # noqa: E501
from openapi_server import util


def get_vault_by_id(vault_uuid):  # noqa: E501
    """Get Vault details and metadata

     # noqa: E501

    :param vault_uuid: The UUID of the Vault to fetch Items from
    :type vault_uuid: str

    :rtype: Union[Vault, Tuple[Vault, int], Tuple[Vault, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vaults(filter=None):  # noqa: E501
    """Get all Vaults

     # noqa: E501

    :param filter: Filter the Vault collection based on Vault name using SCIM eq filter
    :type filter: str

    :rtype: Union[List[Vault], Tuple[List[Vault], int], Tuple[List[Vault], int, Dict[str, str]]
    """
    return 'do some magic!'

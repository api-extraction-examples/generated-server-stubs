import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.full_item import FullItem  # noqa: E501
from openapi_server.models.item import Item  # noqa: E501
from openapi_server.models.patch_inner import PatchInner  # noqa: E501
from openapi_server import util


def create_vault_item(vault_uuid, full_item=None):  # noqa: E501
    """Create a new Item

     # noqa: E501

    :param vault_uuid: The UUID of the Vault to create an Item in
    :type vault_uuid: str
    :param full_item: 
    :type full_item: dict | bytes

    :rtype: Union[FullItem, Tuple[FullItem, int], Tuple[FullItem, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        full_item = FullItem.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_vault_item(vault_uuid, item_uuid):  # noqa: E501
    """Delete an Item

     # noqa: E501

    :param vault_uuid: The UUID of the Vault the item is in
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item to update
    :type item_uuid: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vault_item_by_id(vault_uuid, item_uuid):  # noqa: E501
    """Get the details of an Item

     # noqa: E501

    :param vault_uuid: The UUID of the Vault to fetch Item from
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item to fetch
    :type item_uuid: str

    :rtype: Union[FullItem, Tuple[FullItem, int], Tuple[FullItem, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_vault_items(vault_uuid, filter=None):  # noqa: E501
    """Get all items for inside a Vault

     # noqa: E501

    :param vault_uuid: The UUID of the Vault to fetch Items from
    :type vault_uuid: str
    :param filter: Filter the Item collection based on Item name using SCIM eq filter
    :type filter: str

    :rtype: Union[List[Item], Tuple[List[Item], int], Tuple[List[Item], int, Dict[str, str]]
    """
    return 'do some magic!'


def patch_vault_item(vault_uuid, item_uuid, patch_inner=None):  # noqa: E501
    """Update a subset of Item attributes

    Applies a modified [RFC6902 JSON Patch](https://tools.ietf.org/html/rfc6902) document to an Item or ItemField. This endpoint only supports &#x60;add&#x60;, &#x60;remove&#x60; and &#x60;replace&#x60; operations.  When modifying a specific ItemField, the ItemField&#39;s ID in the &#x60;path&#x60; attribute of the operation object: &#x60;/fields/{fieldId}&#x60;  # noqa: E501

    :param vault_uuid: The UUID of the Vault the item is in
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item to update
    :type item_uuid: str
    :param patch_inner: 
    :type patch_inner: list | bytes

    :rtype: Union[FullItem, Tuple[FullItem, int], Tuple[FullItem, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        patch_inner = [PatchInner.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def update_vault_item(vault_uuid, item_uuid, full_item=None):  # noqa: E501
    """Update an Item

     # noqa: E501

    :param vault_uuid: The UUID of the Item&#39;s Vault
    :type vault_uuid: str
    :param item_uuid: The UUID of the Item to update
    :type item_uuid: str
    :param full_item: 
    :type full_item: dict | bytes

    :rtype: Union[FullItem, Tuple[FullItem, int], Tuple[FullItem, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        full_item = FullItem.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

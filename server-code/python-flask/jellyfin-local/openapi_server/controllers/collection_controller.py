import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.collection_creation_result import CollectionCreationResult  # noqa: E501
from openapi_server import util


def add_to_collection(collection_id, ids):  # noqa: E501
    """Adds items to a collection.

     # noqa: E501

    :param collection_id: The collection id.
    :type collection_id: str
    :type collection_id: str
    :param ids: Item ids, comma delimited.
    :type ids: List[str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def create_collection(name=None, ids=None, parent_id=None, is_locked=None):  # noqa: E501
    """Creates a new collection.

     # noqa: E501

    :param name: The name of the collection.
    :type name: str
    :param ids: Item Ids to add to the collection.
    :type ids: List[str]
    :param parent_id: Optional. Create the collection within a specific folder.
    :type parent_id: str
    :type parent_id: str
    :param is_locked: Whether or not to lock the new collection.
    :type is_locked: bool

    :rtype: Union[CollectionCreationResult, Tuple[CollectionCreationResult, int], Tuple[CollectionCreationResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_from_collection(collection_id, ids):  # noqa: E501
    """Removes items from a collection.

     # noqa: E501

    :param collection_id: The collection id.
    :type collection_id: str
    :type collection_id: str
    :param ids: Item ids, comma delimited.
    :type ids: List[str]

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'

from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class LibraryUpdateInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, collection_folders=None, folders_added_to=None, folders_removed_from=None, is_empty=None, items_added=None, items_removed=None, items_updated=None):  # noqa: E501
        """LibraryUpdateInfo - a model defined in OpenAPI

        :param collection_folders: The collection_folders of this LibraryUpdateInfo.  # noqa: E501
        :type collection_folders: List[str]
        :param folders_added_to: The folders_added_to of this LibraryUpdateInfo.  # noqa: E501
        :type folders_added_to: List[str]
        :param folders_removed_from: The folders_removed_from of this LibraryUpdateInfo.  # noqa: E501
        :type folders_removed_from: List[str]
        :param is_empty: The is_empty of this LibraryUpdateInfo.  # noqa: E501
        :type is_empty: bool
        :param items_added: The items_added of this LibraryUpdateInfo.  # noqa: E501
        :type items_added: List[str]
        :param items_removed: The items_removed of this LibraryUpdateInfo.  # noqa: E501
        :type items_removed: List[str]
        :param items_updated: The items_updated of this LibraryUpdateInfo.  # noqa: E501
        :type items_updated: List[str]
        """
        self.openapi_types = {
            'collection_folders': List[str],
            'folders_added_to': List[str],
            'folders_removed_from': List[str],
            'is_empty': bool,
            'items_added': List[str],
            'items_removed': List[str],
            'items_updated': List[str]
        }

        self.attribute_map = {
            'collection_folders': 'CollectionFolders',
            'folders_added_to': 'FoldersAddedTo',
            'folders_removed_from': 'FoldersRemovedFrom',
            'is_empty': 'IsEmpty',
            'items_added': 'ItemsAdded',
            'items_removed': 'ItemsRemoved',
            'items_updated': 'ItemsUpdated'
        }

        self._collection_folders = collection_folders
        self._folders_added_to = folders_added_to
        self._folders_removed_from = folders_removed_from
        self._is_empty = is_empty
        self._items_added = items_added
        self._items_removed = items_removed
        self._items_updated = items_updated

    @classmethod
    def from_dict(cls, dikt) -> 'LibraryUpdateInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LibraryUpdateInfo of this LibraryUpdateInfo.  # noqa: E501
        :rtype: LibraryUpdateInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def collection_folders(self) -> List[str]:
        """Gets the collection_folders of this LibraryUpdateInfo.


        :return: The collection_folders of this LibraryUpdateInfo.
        :rtype: List[str]
        """
        return self._collection_folders

    @collection_folders.setter
    def collection_folders(self, collection_folders: List[str]):
        """Sets the collection_folders of this LibraryUpdateInfo.


        :param collection_folders: The collection_folders of this LibraryUpdateInfo.
        :type collection_folders: List[str]
        """

        self._collection_folders = collection_folders

    @property
    def folders_added_to(self) -> List[str]:
        """Gets the folders_added_to of this LibraryUpdateInfo.

        Gets or sets the folders added to.  # noqa: E501

        :return: The folders_added_to of this LibraryUpdateInfo.
        :rtype: List[str]
        """
        return self._folders_added_to

    @folders_added_to.setter
    def folders_added_to(self, folders_added_to: List[str]):
        """Sets the folders_added_to of this LibraryUpdateInfo.

        Gets or sets the folders added to.  # noqa: E501

        :param folders_added_to: The folders_added_to of this LibraryUpdateInfo.
        :type folders_added_to: List[str]
        """

        self._folders_added_to = folders_added_to

    @property
    def folders_removed_from(self) -> List[str]:
        """Gets the folders_removed_from of this LibraryUpdateInfo.

        Gets or sets the folders removed from.  # noqa: E501

        :return: The folders_removed_from of this LibraryUpdateInfo.
        :rtype: List[str]
        """
        return self._folders_removed_from

    @folders_removed_from.setter
    def folders_removed_from(self, folders_removed_from: List[str]):
        """Sets the folders_removed_from of this LibraryUpdateInfo.

        Gets or sets the folders removed from.  # noqa: E501

        :param folders_removed_from: The folders_removed_from of this LibraryUpdateInfo.
        :type folders_removed_from: List[str]
        """

        self._folders_removed_from = folders_removed_from

    @property
    def is_empty(self) -> bool:
        """Gets the is_empty of this LibraryUpdateInfo.


        :return: The is_empty of this LibraryUpdateInfo.
        :rtype: bool
        """
        return self._is_empty

    @is_empty.setter
    def is_empty(self, is_empty: bool):
        """Sets the is_empty of this LibraryUpdateInfo.


        :param is_empty: The is_empty of this LibraryUpdateInfo.
        :type is_empty: bool
        """

        self._is_empty = is_empty

    @property
    def items_added(self) -> List[str]:
        """Gets the items_added of this LibraryUpdateInfo.

        Gets or sets the items added.  # noqa: E501

        :return: The items_added of this LibraryUpdateInfo.
        :rtype: List[str]
        """
        return self._items_added

    @items_added.setter
    def items_added(self, items_added: List[str]):
        """Sets the items_added of this LibraryUpdateInfo.

        Gets or sets the items added.  # noqa: E501

        :param items_added: The items_added of this LibraryUpdateInfo.
        :type items_added: List[str]
        """

        self._items_added = items_added

    @property
    def items_removed(self) -> List[str]:
        """Gets the items_removed of this LibraryUpdateInfo.

        Gets or sets the items removed.  # noqa: E501

        :return: The items_removed of this LibraryUpdateInfo.
        :rtype: List[str]
        """
        return self._items_removed

    @items_removed.setter
    def items_removed(self, items_removed: List[str]):
        """Sets the items_removed of this LibraryUpdateInfo.

        Gets or sets the items removed.  # noqa: E501

        :param items_removed: The items_removed of this LibraryUpdateInfo.
        :type items_removed: List[str]
        """

        self._items_removed = items_removed

    @property
    def items_updated(self) -> List[str]:
        """Gets the items_updated of this LibraryUpdateInfo.

        Gets or sets the items updated.  # noqa: E501

        :return: The items_updated of this LibraryUpdateInfo.
        :rtype: List[str]
        """
        return self._items_updated

    @items_updated.setter
    def items_updated(self, items_updated: List[str]):
        """Sets the items_updated of this LibraryUpdateInfo.

        Gets or sets the items updated.  # noqa: E501

        :param items_updated: The items_updated of this LibraryUpdateInfo.
        :type items_updated: List[str]
        """

        self._items_updated = items_updated

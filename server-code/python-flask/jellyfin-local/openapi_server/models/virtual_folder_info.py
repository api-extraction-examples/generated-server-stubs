from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.library_options import LibraryOptions
from openapi_server import util

from openapi_server.models.library_options import LibraryOptions  # noqa: E501

class VirtualFolderInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, collection_type=None, item_id=None, library_options=None, locations=None, name=None, primary_image_item_id=None, refresh_progress=None, refresh_status=None):  # noqa: E501
        """VirtualFolderInfo - a model defined in OpenAPI

        :param collection_type: The collection_type of this VirtualFolderInfo.  # noqa: E501
        :type collection_type: str
        :param item_id: The item_id of this VirtualFolderInfo.  # noqa: E501
        :type item_id: str
        :param library_options: The library_options of this VirtualFolderInfo.  # noqa: E501
        :type library_options: LibraryOptions
        :param locations: The locations of this VirtualFolderInfo.  # noqa: E501
        :type locations: List[str]
        :param name: The name of this VirtualFolderInfo.  # noqa: E501
        :type name: str
        :param primary_image_item_id: The primary_image_item_id of this VirtualFolderInfo.  # noqa: E501
        :type primary_image_item_id: str
        :param refresh_progress: The refresh_progress of this VirtualFolderInfo.  # noqa: E501
        :type refresh_progress: float
        :param refresh_status: The refresh_status of this VirtualFolderInfo.  # noqa: E501
        :type refresh_status: str
        """
        self.openapi_types = {
            'collection_type': str,
            'item_id': str,
            'library_options': LibraryOptions,
            'locations': List[str],
            'name': str,
            'primary_image_item_id': str,
            'refresh_progress': float,
            'refresh_status': str
        }

        self.attribute_map = {
            'collection_type': 'CollectionType',
            'item_id': 'ItemId',
            'library_options': 'LibraryOptions',
            'locations': 'Locations',
            'name': 'Name',
            'primary_image_item_id': 'PrimaryImageItemId',
            'refresh_progress': 'RefreshProgress',
            'refresh_status': 'RefreshStatus'
        }

        self._collection_type = collection_type
        self._item_id = item_id
        self._library_options = library_options
        self._locations = locations
        self._name = name
        self._primary_image_item_id = primary_image_item_id
        self._refresh_progress = refresh_progress
        self._refresh_status = refresh_status

    @classmethod
    def from_dict(cls, dikt) -> 'VirtualFolderInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The VirtualFolderInfo of this VirtualFolderInfo.  # noqa: E501
        :rtype: VirtualFolderInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def collection_type(self) -> str:
        """Gets the collection_type of this VirtualFolderInfo.

        Gets or sets the type of the collection.  # noqa: E501

        :return: The collection_type of this VirtualFolderInfo.
        :rtype: str
        """
        return self._collection_type

    @collection_type.setter
    def collection_type(self, collection_type: str):
        """Sets the collection_type of this VirtualFolderInfo.

        Gets or sets the type of the collection.  # noqa: E501

        :param collection_type: The collection_type of this VirtualFolderInfo.
        :type collection_type: str
        """

        self._collection_type = collection_type

    @property
    def item_id(self) -> str:
        """Gets the item_id of this VirtualFolderInfo.

        Gets or sets the item identifier.  # noqa: E501

        :return: The item_id of this VirtualFolderInfo.
        :rtype: str
        """
        return self._item_id

    @item_id.setter
    def item_id(self, item_id: str):
        """Sets the item_id of this VirtualFolderInfo.

        Gets or sets the item identifier.  # noqa: E501

        :param item_id: The item_id of this VirtualFolderInfo.
        :type item_id: str
        """

        self._item_id = item_id

    @property
    def library_options(self) -> LibraryOptions:
        """Gets the library_options of this VirtualFolderInfo.


        :return: The library_options of this VirtualFolderInfo.
        :rtype: LibraryOptions
        """
        return self._library_options

    @library_options.setter
    def library_options(self, library_options: LibraryOptions):
        """Sets the library_options of this VirtualFolderInfo.


        :param library_options: The library_options of this VirtualFolderInfo.
        :type library_options: LibraryOptions
        """

        self._library_options = library_options

    @property
    def locations(self) -> List[str]:
        """Gets the locations of this VirtualFolderInfo.

        Gets or sets the locations.  # noqa: E501

        :return: The locations of this VirtualFolderInfo.
        :rtype: List[str]
        """
        return self._locations

    @locations.setter
    def locations(self, locations: List[str]):
        """Sets the locations of this VirtualFolderInfo.

        Gets or sets the locations.  # noqa: E501

        :param locations: The locations of this VirtualFolderInfo.
        :type locations: List[str]
        """

        self._locations = locations

    @property
    def name(self) -> str:
        """Gets the name of this VirtualFolderInfo.

        Gets or sets the name.  # noqa: E501

        :return: The name of this VirtualFolderInfo.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this VirtualFolderInfo.

        Gets or sets the name.  # noqa: E501

        :param name: The name of this VirtualFolderInfo.
        :type name: str
        """

        self._name = name

    @property
    def primary_image_item_id(self) -> str:
        """Gets the primary_image_item_id of this VirtualFolderInfo.

        Gets or sets the primary image item identifier.  # noqa: E501

        :return: The primary_image_item_id of this VirtualFolderInfo.
        :rtype: str
        """
        return self._primary_image_item_id

    @primary_image_item_id.setter
    def primary_image_item_id(self, primary_image_item_id: str):
        """Sets the primary_image_item_id of this VirtualFolderInfo.

        Gets or sets the primary image item identifier.  # noqa: E501

        :param primary_image_item_id: The primary_image_item_id of this VirtualFolderInfo.
        :type primary_image_item_id: str
        """

        self._primary_image_item_id = primary_image_item_id

    @property
    def refresh_progress(self) -> float:
        """Gets the refresh_progress of this VirtualFolderInfo.


        :return: The refresh_progress of this VirtualFolderInfo.
        :rtype: float
        """
        return self._refresh_progress

    @refresh_progress.setter
    def refresh_progress(self, refresh_progress: float):
        """Sets the refresh_progress of this VirtualFolderInfo.


        :param refresh_progress: The refresh_progress of this VirtualFolderInfo.
        :type refresh_progress: float
        """

        self._refresh_progress = refresh_progress

    @property
    def refresh_status(self) -> str:
        """Gets the refresh_status of this VirtualFolderInfo.


        :return: The refresh_status of this VirtualFolderInfo.
        :rtype: str
        """
        return self._refresh_status

    @refresh_status.setter
    def refresh_status(self, refresh_status: str):
        """Sets the refresh_status of this VirtualFolderInfo.


        :param refresh_status: The refresh_status of this VirtualFolderInfo.
        :type refresh_status: str
        """

        self._refresh_status = refresh_status

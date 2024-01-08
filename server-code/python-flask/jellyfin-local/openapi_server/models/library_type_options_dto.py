from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.image_option import ImageOption
from openapi_server.models.image_type import ImageType
from openapi_server.models.library_option_info_dto import LibraryOptionInfoDto
from openapi_server import util

from openapi_server.models.image_option import ImageOption  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.library_option_info_dto import LibraryOptionInfoDto  # noqa: E501

class LibraryTypeOptionsDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, default_image_options=None, image_fetchers=None, metadata_fetchers=None, supported_image_types=None, type=None):  # noqa: E501
        """LibraryTypeOptionsDto - a model defined in OpenAPI

        :param default_image_options: The default_image_options of this LibraryTypeOptionsDto.  # noqa: E501
        :type default_image_options: List[ImageOption]
        :param image_fetchers: The image_fetchers of this LibraryTypeOptionsDto.  # noqa: E501
        :type image_fetchers: List[LibraryOptionInfoDto]
        :param metadata_fetchers: The metadata_fetchers of this LibraryTypeOptionsDto.  # noqa: E501
        :type metadata_fetchers: List[LibraryOptionInfoDto]
        :param supported_image_types: The supported_image_types of this LibraryTypeOptionsDto.  # noqa: E501
        :type supported_image_types: List[ImageType]
        :param type: The type of this LibraryTypeOptionsDto.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'default_image_options': List[ImageOption],
            'image_fetchers': List[LibraryOptionInfoDto],
            'metadata_fetchers': List[LibraryOptionInfoDto],
            'supported_image_types': List[ImageType],
            'type': str
        }

        self.attribute_map = {
            'default_image_options': 'DefaultImageOptions',
            'image_fetchers': 'ImageFetchers',
            'metadata_fetchers': 'MetadataFetchers',
            'supported_image_types': 'SupportedImageTypes',
            'type': 'Type'
        }

        self._default_image_options = default_image_options
        self._image_fetchers = image_fetchers
        self._metadata_fetchers = metadata_fetchers
        self._supported_image_types = supported_image_types
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'LibraryTypeOptionsDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LibraryTypeOptionsDto of this LibraryTypeOptionsDto.  # noqa: E501
        :rtype: LibraryTypeOptionsDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def default_image_options(self) -> List[ImageOption]:
        """Gets the default_image_options of this LibraryTypeOptionsDto.

        Gets or sets the default image options.  # noqa: E501

        :return: The default_image_options of this LibraryTypeOptionsDto.
        :rtype: List[ImageOption]
        """
        return self._default_image_options

    @default_image_options.setter
    def default_image_options(self, default_image_options: List[ImageOption]):
        """Sets the default_image_options of this LibraryTypeOptionsDto.

        Gets or sets the default image options.  # noqa: E501

        :param default_image_options: The default_image_options of this LibraryTypeOptionsDto.
        :type default_image_options: List[ImageOption]
        """

        self._default_image_options = default_image_options

    @property
    def image_fetchers(self) -> List[LibraryOptionInfoDto]:
        """Gets the image_fetchers of this LibraryTypeOptionsDto.

        Gets or sets the image fetchers.  # noqa: E501

        :return: The image_fetchers of this LibraryTypeOptionsDto.
        :rtype: List[LibraryOptionInfoDto]
        """
        return self._image_fetchers

    @image_fetchers.setter
    def image_fetchers(self, image_fetchers: List[LibraryOptionInfoDto]):
        """Sets the image_fetchers of this LibraryTypeOptionsDto.

        Gets or sets the image fetchers.  # noqa: E501

        :param image_fetchers: The image_fetchers of this LibraryTypeOptionsDto.
        :type image_fetchers: List[LibraryOptionInfoDto]
        """

        self._image_fetchers = image_fetchers

    @property
    def metadata_fetchers(self) -> List[LibraryOptionInfoDto]:
        """Gets the metadata_fetchers of this LibraryTypeOptionsDto.

        Gets or sets the metadata fetchers.  # noqa: E501

        :return: The metadata_fetchers of this LibraryTypeOptionsDto.
        :rtype: List[LibraryOptionInfoDto]
        """
        return self._metadata_fetchers

    @metadata_fetchers.setter
    def metadata_fetchers(self, metadata_fetchers: List[LibraryOptionInfoDto]):
        """Sets the metadata_fetchers of this LibraryTypeOptionsDto.

        Gets or sets the metadata fetchers.  # noqa: E501

        :param metadata_fetchers: The metadata_fetchers of this LibraryTypeOptionsDto.
        :type metadata_fetchers: List[LibraryOptionInfoDto]
        """

        self._metadata_fetchers = metadata_fetchers

    @property
    def supported_image_types(self) -> List[ImageType]:
        """Gets the supported_image_types of this LibraryTypeOptionsDto.

        Gets or sets the supported image types.  # noqa: E501

        :return: The supported_image_types of this LibraryTypeOptionsDto.
        :rtype: List[ImageType]
        """
        return self._supported_image_types

    @supported_image_types.setter
    def supported_image_types(self, supported_image_types: List[ImageType]):
        """Sets the supported_image_types of this LibraryTypeOptionsDto.

        Gets or sets the supported image types.  # noqa: E501

        :param supported_image_types: The supported_image_types of this LibraryTypeOptionsDto.
        :type supported_image_types: List[ImageType]
        """

        self._supported_image_types = supported_image_types

    @property
    def type(self) -> str:
        """Gets the type of this LibraryTypeOptionsDto.

        Gets or sets the type.  # noqa: E501

        :return: The type of this LibraryTypeOptionsDto.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this LibraryTypeOptionsDto.

        Gets or sets the type.  # noqa: E501

        :param type: The type of this LibraryTypeOptionsDto.
        :type type: str
        """

        self._type = type
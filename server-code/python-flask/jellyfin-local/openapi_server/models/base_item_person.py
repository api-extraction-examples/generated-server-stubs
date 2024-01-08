from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.base_item_person_image_blur_hashes import BaseItemPersonImageBlurHashes
from openapi_server import util

from openapi_server.models.base_item_person_image_blur_hashes import BaseItemPersonImageBlurHashes  # noqa: E501

class BaseItemPerson(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, image_blur_hashes=None, name=None, primary_image_tag=None, role=None, type=None):  # noqa: E501
        """BaseItemPerson - a model defined in OpenAPI

        :param id: The id of this BaseItemPerson.  # noqa: E501
        :type id: str
        :param image_blur_hashes: The image_blur_hashes of this BaseItemPerson.  # noqa: E501
        :type image_blur_hashes: BaseItemPersonImageBlurHashes
        :param name: The name of this BaseItemPerson.  # noqa: E501
        :type name: str
        :param primary_image_tag: The primary_image_tag of this BaseItemPerson.  # noqa: E501
        :type primary_image_tag: str
        :param role: The role of this BaseItemPerson.  # noqa: E501
        :type role: str
        :param type: The type of this BaseItemPerson.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'id': str,
            'image_blur_hashes': BaseItemPersonImageBlurHashes,
            'name': str,
            'primary_image_tag': str,
            'role': str,
            'type': str
        }

        self.attribute_map = {
            'id': 'Id',
            'image_blur_hashes': 'ImageBlurHashes',
            'name': 'Name',
            'primary_image_tag': 'PrimaryImageTag',
            'role': 'Role',
            'type': 'Type'
        }

        self._id = id
        self._image_blur_hashes = image_blur_hashes
        self._name = name
        self._primary_image_tag = primary_image_tag
        self._role = role
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BaseItemPerson':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BaseItemPerson of this BaseItemPerson.  # noqa: E501
        :rtype: BaseItemPerson
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this BaseItemPerson.

        Gets or sets the identifier.  # noqa: E501

        :return: The id of this BaseItemPerson.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BaseItemPerson.

        Gets or sets the identifier.  # noqa: E501

        :param id: The id of this BaseItemPerson.
        :type id: str
        """

        self._id = id

    @property
    def image_blur_hashes(self) -> BaseItemPersonImageBlurHashes:
        """Gets the image_blur_hashes of this BaseItemPerson.


        :return: The image_blur_hashes of this BaseItemPerson.
        :rtype: BaseItemPersonImageBlurHashes
        """
        return self._image_blur_hashes

    @image_blur_hashes.setter
    def image_blur_hashes(self, image_blur_hashes: BaseItemPersonImageBlurHashes):
        """Sets the image_blur_hashes of this BaseItemPerson.


        :param image_blur_hashes: The image_blur_hashes of this BaseItemPerson.
        :type image_blur_hashes: BaseItemPersonImageBlurHashes
        """

        self._image_blur_hashes = image_blur_hashes

    @property
    def name(self) -> str:
        """Gets the name of this BaseItemPerson.

        Gets or sets the name.  # noqa: E501

        :return: The name of this BaseItemPerson.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this BaseItemPerson.

        Gets or sets the name.  # noqa: E501

        :param name: The name of this BaseItemPerson.
        :type name: str
        """

        self._name = name

    @property
    def primary_image_tag(self) -> str:
        """Gets the primary_image_tag of this BaseItemPerson.

        Gets or sets the primary image tag.  # noqa: E501

        :return: The primary_image_tag of this BaseItemPerson.
        :rtype: str
        """
        return self._primary_image_tag

    @primary_image_tag.setter
    def primary_image_tag(self, primary_image_tag: str):
        """Sets the primary_image_tag of this BaseItemPerson.

        Gets or sets the primary image tag.  # noqa: E501

        :param primary_image_tag: The primary_image_tag of this BaseItemPerson.
        :type primary_image_tag: str
        """

        self._primary_image_tag = primary_image_tag

    @property
    def role(self) -> str:
        """Gets the role of this BaseItemPerson.

        Gets or sets the role.  # noqa: E501

        :return: The role of this BaseItemPerson.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role: str):
        """Sets the role of this BaseItemPerson.

        Gets or sets the role.  # noqa: E501

        :param role: The role of this BaseItemPerson.
        :type role: str
        """

        self._role = role

    @property
    def type(self) -> str:
        """Gets the type of this BaseItemPerson.

        Gets or sets the type.  # noqa: E501

        :return: The type of this BaseItemPerson.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BaseItemPerson.

        Gets or sets the type.  # noqa: E501

        :param type: The type of this BaseItemPerson.
        :type type: str
        """

        self._type = type

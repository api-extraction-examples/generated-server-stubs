from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ImageHistory200ResponseInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, comment=None, created=None, created_by=None, id=None, size=None, tags=None):  # noqa: E501
        """ImageHistory200ResponseInner - a model defined in OpenAPI

        :param comment: The comment of this ImageHistory200ResponseInner.  # noqa: E501
        :type comment: str
        :param created: The created of this ImageHistory200ResponseInner.  # noqa: E501
        :type created: int
        :param created_by: The created_by of this ImageHistory200ResponseInner.  # noqa: E501
        :type created_by: str
        :param id: The id of this ImageHistory200ResponseInner.  # noqa: E501
        :type id: str
        :param size: The size of this ImageHistory200ResponseInner.  # noqa: E501
        :type size: int
        :param tags: The tags of this ImageHistory200ResponseInner.  # noqa: E501
        :type tags: List[str]
        """
        self.openapi_types = {
            'comment': str,
            'created': int,
            'created_by': str,
            'id': str,
            'size': int,
            'tags': List[str]
        }

        self.attribute_map = {
            'comment': 'Comment',
            'created': 'Created',
            'created_by': 'CreatedBy',
            'id': 'Id',
            'size': 'Size',
            'tags': 'Tags'
        }

        self._comment = comment
        self._created = created
        self._created_by = created_by
        self._id = id
        self._size = size
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'ImageHistory200ResponseInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ImageHistory_200_response_inner of this ImageHistory200ResponseInner.  # noqa: E501
        :rtype: ImageHistory200ResponseInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def comment(self) -> str:
        """Gets the comment of this ImageHistory200ResponseInner.


        :return: The comment of this ImageHistory200ResponseInner.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this ImageHistory200ResponseInner.


        :param comment: The comment of this ImageHistory200ResponseInner.
        :type comment: str
        """
        if comment is None:
            raise ValueError("Invalid value for `comment`, must not be `None`")  # noqa: E501

        self._comment = comment

    @property
    def created(self) -> int:
        """Gets the created of this ImageHistory200ResponseInner.


        :return: The created of this ImageHistory200ResponseInner.
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created: int):
        """Sets the created of this ImageHistory200ResponseInner.


        :param created: The created of this ImageHistory200ResponseInner.
        :type created: int
        """
        if created is None:
            raise ValueError("Invalid value for `created`, must not be `None`")  # noqa: E501

        self._created = created

    @property
    def created_by(self) -> str:
        """Gets the created_by of this ImageHistory200ResponseInner.


        :return: The created_by of this ImageHistory200ResponseInner.
        :rtype: str
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by: str):
        """Sets the created_by of this ImageHistory200ResponseInner.


        :param created_by: The created_by of this ImageHistory200ResponseInner.
        :type created_by: str
        """
        if created_by is None:
            raise ValueError("Invalid value for `created_by`, must not be `None`")  # noqa: E501

        self._created_by = created_by

    @property
    def id(self) -> str:
        """Gets the id of this ImageHistory200ResponseInner.


        :return: The id of this ImageHistory200ResponseInner.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ImageHistory200ResponseInner.


        :param id: The id of this ImageHistory200ResponseInner.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def size(self) -> int:
        """Gets the size of this ImageHistory200ResponseInner.


        :return: The size of this ImageHistory200ResponseInner.
        :rtype: int
        """
        return self._size

    @size.setter
    def size(self, size: int):
        """Sets the size of this ImageHistory200ResponseInner.


        :param size: The size of this ImageHistory200ResponseInner.
        :type size: int
        """
        if size is None:
            raise ValueError("Invalid value for `size`, must not be `None`")  # noqa: E501

        self._size = size

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this ImageHistory200ResponseInner.


        :return: The tags of this ImageHistory200ResponseInner.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this ImageHistory200ResponseInner.


        :param tags: The tags of this ImageHistory200ResponseInner.
        :type tags: List[str]
        """
        if tags is None:
            raise ValueError("Invalid value for `tags`, must not be `None`")  # noqa: E501

        self._tags = tags

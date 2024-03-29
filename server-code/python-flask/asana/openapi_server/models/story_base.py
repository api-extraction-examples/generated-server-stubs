from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StoryBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, created_at=None, html_text=None, is_pinned=None, resource_subtype=None, sticker_name=None, text=None):  # noqa: E501
        """StoryBase - a model defined in OpenAPI

        :param gid: The gid of this StoryBase.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this StoryBase.  # noqa: E501
        :type resource_type: str
        :param created_at: The created_at of this StoryBase.  # noqa: E501
        :type created_at: datetime
        :param html_text: The html_text of this StoryBase.  # noqa: E501
        :type html_text: str
        :param is_pinned: The is_pinned of this StoryBase.  # noqa: E501
        :type is_pinned: bool
        :param resource_subtype: The resource_subtype of this StoryBase.  # noqa: E501
        :type resource_subtype: str
        :param sticker_name: The sticker_name of this StoryBase.  # noqa: E501
        :type sticker_name: str
        :param text: The text of this StoryBase.  # noqa: E501
        :type text: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'created_at': datetime,
            'html_text': str,
            'is_pinned': bool,
            'resource_subtype': str,
            'sticker_name': str,
            'text': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'created_at': 'created_at',
            'html_text': 'html_text',
            'is_pinned': 'is_pinned',
            'resource_subtype': 'resource_subtype',
            'sticker_name': 'sticker_name',
            'text': 'text'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._created_at = created_at
        self._html_text = html_text
        self._is_pinned = is_pinned
        self._resource_subtype = resource_subtype
        self._sticker_name = sticker_name
        self._text = text

    @classmethod
    def from_dict(cls, dikt) -> 'StoryBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StoryBase of this StoryBase.  # noqa: E501
        :rtype: StoryBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this StoryBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this StoryBase.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this StoryBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this StoryBase.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this StoryBase.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this StoryBase.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this StoryBase.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this StoryBase.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this StoryBase.

        The time at which this resource was created.  # noqa: E501

        :return: The created_at of this StoryBase.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this StoryBase.

        The time at which this resource was created.  # noqa: E501

        :param created_at: The created_at of this StoryBase.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def html_text(self) -> str:
        """Gets the html_text of this StoryBase.

        [Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.  # noqa: E501

        :return: The html_text of this StoryBase.
        :rtype: str
        """
        return self._html_text

    @html_text.setter
    def html_text(self, html_text: str):
        """Sets the html_text of this StoryBase.

        [Opt In](/docs/input-output-options). HTML formatted text for a comment. This will not include the name of the creator.  # noqa: E501

        :param html_text: The html_text of this StoryBase.
        :type html_text: str
        """

        self._html_text = html_text

    @property
    def is_pinned(self) -> bool:
        """Gets the is_pinned of this StoryBase.

        *Conditional*. Whether the story should be pinned on the resource.  # noqa: E501

        :return: The is_pinned of this StoryBase.
        :rtype: bool
        """
        return self._is_pinned

    @is_pinned.setter
    def is_pinned(self, is_pinned: bool):
        """Sets the is_pinned of this StoryBase.

        *Conditional*. Whether the story should be pinned on the resource.  # noqa: E501

        :param is_pinned: The is_pinned of this StoryBase.
        :type is_pinned: bool
        """

        self._is_pinned = is_pinned

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this StoryBase.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.  # noqa: E501

        :return: The resource_subtype of this StoryBase.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this StoryBase.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.  # noqa: E501

        :param resource_subtype: The resource_subtype of this StoryBase.
        :type resource_subtype: str
        """

        self._resource_subtype = resource_subtype

    @property
    def sticker_name(self) -> str:
        """Gets the sticker_name of this StoryBase.

        The name of the sticker in this story. `null` if there is no sticker.  # noqa: E501

        :return: The sticker_name of this StoryBase.
        :rtype: str
        """
        return self._sticker_name

    @sticker_name.setter
    def sticker_name(self, sticker_name: str):
        """Sets the sticker_name of this StoryBase.

        The name of the sticker in this story. `null` if there is no sticker.  # noqa: E501

        :param sticker_name: The sticker_name of this StoryBase.
        :type sticker_name: str
        """
        allowed_values = ["green_checkmark", "people_dancing", "dancing_unicorn", "heart", "party_popper", "people_waving_flags", "splashing_narwhal", "trophy", "yeti_riding_unicorn", "celebrating_people", "determined_climbers", "phoenix_spreading_love"]  # noqa: E501
        if sticker_name not in allowed_values:
            raise ValueError(
                "Invalid value for `sticker_name` ({0}), must be one of {1}"
                .format(sticker_name, allowed_values)
            )

        self._sticker_name = sticker_name

    @property
    def text(self) -> str:
        """Gets the text of this StoryBase.

        The plain text of the comment to add. Cannot be used with html_text.  # noqa: E501

        :return: The text of this StoryBase.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this StoryBase.

        The plain text of the comment to add. Cannot be used with html_text.  # noqa: E501

        :param text: The text of this StoryBase.
        :type text: str
        """

        self._text = text

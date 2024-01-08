from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StatusUpdateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, resource_subtype=None, title=None, html_text=None, status_type=None, text=None, parent=None):  # noqa: E501
        """StatusUpdateRequest - a model defined in OpenAPI

        :param gid: The gid of this StatusUpdateRequest.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this StatusUpdateRequest.  # noqa: E501
        :type resource_type: str
        :param resource_subtype: The resource_subtype of this StatusUpdateRequest.  # noqa: E501
        :type resource_subtype: str
        :param title: The title of this StatusUpdateRequest.  # noqa: E501
        :type title: str
        :param html_text: The html_text of this StatusUpdateRequest.  # noqa: E501
        :type html_text: str
        :param status_type: The status_type of this StatusUpdateRequest.  # noqa: E501
        :type status_type: str
        :param text: The text of this StatusUpdateRequest.  # noqa: E501
        :type text: str
        :param parent: The parent of this StatusUpdateRequest.  # noqa: E501
        :type parent: object
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'resource_subtype': str,
            'title': str,
            'html_text': str,
            'status_type': str,
            'text': str,
            'parent': object
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'resource_subtype': 'resource_subtype',
            'title': 'title',
            'html_text': 'html_text',
            'status_type': 'status_type',
            'text': 'text',
            'parent': 'parent'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._resource_subtype = resource_subtype
        self._title = title
        self._html_text = html_text
        self._status_type = status_type
        self._text = text
        self._parent = parent

    @classmethod
    def from_dict(cls, dikt) -> 'StatusUpdateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StatusUpdateRequest of this StatusUpdateRequest.  # noqa: E501
        :rtype: StatusUpdateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this StatusUpdateRequest.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this StatusUpdateRequest.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this StatusUpdateRequest.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this StatusUpdateRequest.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this StatusUpdateRequest.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this StatusUpdateRequest.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this StatusUpdateRequest.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this StatusUpdateRequest.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this StatusUpdateRequest.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.  # noqa: E501

        :return: The resource_subtype of this StatusUpdateRequest.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this StatusUpdateRequest.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.  # noqa: E501

        :param resource_subtype: The resource_subtype of this StatusUpdateRequest.
        :type resource_subtype: str
        """
        allowed_values = ["project_status_update", "portfolio_status_update", "goal_status_update"]  # noqa: E501
        if resource_subtype not in allowed_values:
            raise ValueError(
                "Invalid value for `resource_subtype` ({0}), must be one of {1}"
                .format(resource_subtype, allowed_values)
            )

        self._resource_subtype = resource_subtype

    @property
    def title(self) -> str:
        """Gets the title of this StatusUpdateRequest.

        The title of the status update.  # noqa: E501

        :return: The title of this StatusUpdateRequest.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this StatusUpdateRequest.

        The title of the status update.  # noqa: E501

        :param title: The title of this StatusUpdateRequest.
        :type title: str
        """

        self._title = title

    @property
    def html_text(self) -> str:
        """Gets the html_text of this StatusUpdateRequest.

        [Opt In](/docs/input-output-options). The text content of the status update with formatting as HTML.  # noqa: E501

        :return: The html_text of this StatusUpdateRequest.
        :rtype: str
        """
        return self._html_text

    @html_text.setter
    def html_text(self, html_text: str):
        """Sets the html_text of this StatusUpdateRequest.

        [Opt In](/docs/input-output-options). The text content of the status update with formatting as HTML.  # noqa: E501

        :param html_text: The html_text of this StatusUpdateRequest.
        :type html_text: str
        """

        self._html_text = html_text

    @property
    def status_type(self) -> str:
        """Gets the status_type of this StatusUpdateRequest.

        The type associated with the status update. This represents the current state of the object this object is on.  # noqa: E501

        :return: The status_type of this StatusUpdateRequest.
        :rtype: str
        """
        return self._status_type

    @status_type.setter
    def status_type(self, status_type: str):
        """Sets the status_type of this StatusUpdateRequest.

        The type associated with the status update. This represents the current state of the object this object is on.  # noqa: E501

        :param status_type: The status_type of this StatusUpdateRequest.
        :type status_type: str
        """
        allowed_values = ["on_track", "at_risk", "off_track", "on_hold", "complete", "achieved", "partial", "missed", "dropped"]  # noqa: E501
        if status_type not in allowed_values:
            raise ValueError(
                "Invalid value for `status_type` ({0}), must be one of {1}"
                .format(status_type, allowed_values)
            )

        self._status_type = status_type

    @property
    def text(self) -> str:
        """Gets the text of this StatusUpdateRequest.

        The text content of the status update.  # noqa: E501

        :return: The text of this StatusUpdateRequest.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this StatusUpdateRequest.

        The text content of the status update.  # noqa: E501

        :param text: The text of this StatusUpdateRequest.
        :type text: str
        """
        if text is None:
            raise ValueError("Invalid value for `text`, must not be `None`")  # noqa: E501

        self._text = text

    @property
    def parent(self) -> object:
        """Gets the parent of this StatusUpdateRequest.


        :return: The parent of this StatusUpdateRequest.
        :rtype: object
        """
        return self._parent

    @parent.setter
    def parent(self, parent: object):
        """Sets the parent of this StatusUpdateRequest.


        :param parent: The parent of this StatusUpdateRequest.
        :type parent: object
        """
        if parent is None:
            raise ValueError("Invalid value for `parent`, must not be `None`")  # noqa: E501

        self._parent = parent

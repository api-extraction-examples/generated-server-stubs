from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TrackedActionLastAccessed(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action_name=None, last_accessed_entity=None, last_accessed_time=None, last_accessed_region=None):  # noqa: E501
        """TrackedActionLastAccessed - a model defined in OpenAPI

        :param action_name: The action_name of this TrackedActionLastAccessed.  # noqa: E501
        :type action_name: str
        :param last_accessed_entity: The last_accessed_entity of this TrackedActionLastAccessed.  # noqa: E501
        :type last_accessed_entity: str
        :param last_accessed_time: The last_accessed_time of this TrackedActionLastAccessed.  # noqa: E501
        :type last_accessed_time: datetime
        :param last_accessed_region: The last_accessed_region of this TrackedActionLastAccessed.  # noqa: E501
        :type last_accessed_region: str
        """
        self.openapi_types = {
            'action_name': str,
            'last_accessed_entity': str,
            'last_accessed_time': datetime,
            'last_accessed_region': str
        }

        self.attribute_map = {
            'action_name': 'ActionName',
            'last_accessed_entity': 'LastAccessedEntity',
            'last_accessed_time': 'LastAccessedTime',
            'last_accessed_region': 'LastAccessedRegion'
        }

        self._action_name = action_name
        self._last_accessed_entity = last_accessed_entity
        self._last_accessed_time = last_accessed_time
        self._last_accessed_region = last_accessed_region

    @classmethod
    def from_dict(cls, dikt) -> 'TrackedActionLastAccessed':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TrackedActionLastAccessed of this TrackedActionLastAccessed.  # noqa: E501
        :rtype: TrackedActionLastAccessed
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action_name(self) -> str:
        """Gets the action_name of this TrackedActionLastAccessed.


        :return: The action_name of this TrackedActionLastAccessed.
        :rtype: str
        """
        return self._action_name

    @action_name.setter
    def action_name(self, action_name: str):
        """Sets the action_name of this TrackedActionLastAccessed.


        :param action_name: The action_name of this TrackedActionLastAccessed.
        :type action_name: str
        """

        self._action_name = action_name

    @property
    def last_accessed_entity(self) -> str:
        """Gets the last_accessed_entity of this TrackedActionLastAccessed.

        <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>  # noqa: E501

        :return: The last_accessed_entity of this TrackedActionLastAccessed.
        :rtype: str
        """
        return self._last_accessed_entity

    @last_accessed_entity.setter
    def last_accessed_entity(self, last_accessed_entity: str):
        """Sets the last_accessed_entity of this TrackedActionLastAccessed.

        <p>The Amazon Resource Name (ARN). ARNs are unique identifiers for Amazon Web Services resources.</p> <p>For more information about ARNs, go to <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>. </p>  # noqa: E501

        :param last_accessed_entity: The last_accessed_entity of this TrackedActionLastAccessed.
        :type last_accessed_entity: str
        """
        if last_accessed_entity is not None and len(last_accessed_entity) > 2048:
            raise ValueError("Invalid value for `last_accessed_entity`, length must be less than or equal to `2048`")  # noqa: E501
        if last_accessed_entity is not None and len(last_accessed_entity) < 20:
            raise ValueError("Invalid value for `last_accessed_entity`, length must be greater than or equal to `20`")  # noqa: E501

        self._last_accessed_entity = last_accessed_entity

    @property
    def last_accessed_time(self) -> datetime:
        """Gets the last_accessed_time of this TrackedActionLastAccessed.


        :return: The last_accessed_time of this TrackedActionLastAccessed.
        :rtype: datetime
        """
        return self._last_accessed_time

    @last_accessed_time.setter
    def last_accessed_time(self, last_accessed_time: datetime):
        """Sets the last_accessed_time of this TrackedActionLastAccessed.


        :param last_accessed_time: The last_accessed_time of this TrackedActionLastAccessed.
        :type last_accessed_time: datetime
        """

        self._last_accessed_time = last_accessed_time

    @property
    def last_accessed_region(self) -> str:
        """Gets the last_accessed_region of this TrackedActionLastAccessed.


        :return: The last_accessed_region of this TrackedActionLastAccessed.
        :rtype: str
        """
        return self._last_accessed_region

    @last_accessed_region.setter
    def last_accessed_region(self, last_accessed_region: str):
        """Sets the last_accessed_region of this TrackedActionLastAccessed.


        :param last_accessed_region: The last_accessed_region of this TrackedActionLastAccessed.
        :type last_accessed_region: str
        """

        self._last_accessed_region = last_accessed_region
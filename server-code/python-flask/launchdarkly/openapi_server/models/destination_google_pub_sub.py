from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DestinationGooglePubSub(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, project=None, topic=None):  # noqa: E501
        """DestinationGooglePubSub - a model defined in OpenAPI

        :param project: The project of this DestinationGooglePubSub.  # noqa: E501
        :type project: str
        :param topic: The topic of this DestinationGooglePubSub.  # noqa: E501
        :type topic: str
        """
        self.openapi_types = {
            'project': str,
            'topic': str
        }

        self.attribute_map = {
            'project': 'project',
            'topic': 'topic'
        }

        self._project = project
        self._topic = topic

    @classmethod
    def from_dict(cls, dikt) -> 'DestinationGooglePubSub':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DestinationGooglePubSub of this DestinationGooglePubSub.  # noqa: E501
        :rtype: DestinationGooglePubSub
        """
        return util.deserialize_model(dikt, cls)

    @property
    def project(self) -> str:
        """Gets the project of this DestinationGooglePubSub.


        :return: The project of this DestinationGooglePubSub.
        :rtype: str
        """
        return self._project

    @project.setter
    def project(self, project: str):
        """Sets the project of this DestinationGooglePubSub.


        :param project: The project of this DestinationGooglePubSub.
        :type project: str
        """

        self._project = project

    @property
    def topic(self) -> str:
        """Gets the topic of this DestinationGooglePubSub.


        :return: The topic of this DestinationGooglePubSub.
        :rtype: str
        """
        return self._topic

    @topic.setter
    def topic(self, topic: str):
        """Sets the topic of this DestinationGooglePubSub.


        :param topic: The topic of this DestinationGooglePubSub.
        :type topic: str
        """

        self._topic = topic

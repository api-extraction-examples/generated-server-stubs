from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.story_base import StoryBase
from openapi_server import util

from openapi_server.models.story_base import StoryBase  # noqa: E501

class UpdateStoryRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """UpdateStoryRequest - a model defined in OpenAPI

        :param data: The data of this UpdateStoryRequest.  # noqa: E501
        :type data: StoryBase
        """
        self.openapi_types = {
            'data': StoryBase
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateStoryRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The updateStory_request of this UpdateStoryRequest.  # noqa: E501
        :rtype: UpdateStoryRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> StoryBase:
        """Gets the data of this UpdateStoryRequest.


        :return: The data of this UpdateStoryRequest.
        :rtype: StoryBase
        """
        return self._data

    @data.setter
    def data(self, data: StoryBase):
        """Sets the data of this UpdateStoryRequest.


        :param data: The data of this UpdateStoryRequest.
        :type data: StoryBase
        """

        self._data = data

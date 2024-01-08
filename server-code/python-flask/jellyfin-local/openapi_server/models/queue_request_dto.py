from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.group_queue_mode import GroupQueueMode
from openapi_server import util

from openapi_server.models.group_queue_mode import GroupQueueMode  # noqa: E501

class QueueRequestDto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, item_ids=None, mode=None):  # noqa: E501
        """QueueRequestDto - a model defined in OpenAPI

        :param item_ids: The item_ids of this QueueRequestDto.  # noqa: E501
        :type item_ids: List[str]
        :param mode: The mode of this QueueRequestDto.  # noqa: E501
        :type mode: GroupQueueMode
        """
        self.openapi_types = {
            'item_ids': List[str],
            'mode': GroupQueueMode
        }

        self.attribute_map = {
            'item_ids': 'ItemIds',
            'mode': 'Mode'
        }

        self._item_ids = item_ids
        self._mode = mode

    @classmethod
    def from_dict(cls, dikt) -> 'QueueRequestDto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The QueueRequestDto of this QueueRequestDto.  # noqa: E501
        :rtype: QueueRequestDto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def item_ids(self) -> List[str]:
        """Gets the item_ids of this QueueRequestDto.

        Gets or sets the items to enqueue.  # noqa: E501

        :return: The item_ids of this QueueRequestDto.
        :rtype: List[str]
        """
        return self._item_ids

    @item_ids.setter
    def item_ids(self, item_ids: List[str]):
        """Sets the item_ids of this QueueRequestDto.

        Gets or sets the items to enqueue.  # noqa: E501

        :param item_ids: The item_ids of this QueueRequestDto.
        :type item_ids: List[str]
        """

        self._item_ids = item_ids

    @property
    def mode(self) -> GroupQueueMode:
        """Gets the mode of this QueueRequestDto.


        :return: The mode of this QueueRequestDto.
        :rtype: GroupQueueMode
        """
        return self._mode

    @mode.setter
    def mode(self, mode: GroupQueueMode):
        """Sets the mode of this QueueRequestDto.


        :param mode: The mode of this QueueRequestDto.
        :type mode: GroupQueueMode
        """

        self._mode = mode
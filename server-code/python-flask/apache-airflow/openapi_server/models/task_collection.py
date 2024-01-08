from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.task import Task
from openapi_server import util

from openapi_server.models.task import Task  # noqa: E501

class TaskCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, tasks=None):  # noqa: E501
        """TaskCollection - a model defined in OpenAPI

        :param tasks: The tasks of this TaskCollection.  # noqa: E501
        :type tasks: List[Task]
        """
        self.openapi_types = {
            'tasks': List[Task]
        }

        self.attribute_map = {
            'tasks': 'tasks'
        }

        self._tasks = tasks

    @classmethod
    def from_dict(cls, dikt) -> 'TaskCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskCollection of this TaskCollection.  # noqa: E501
        :rtype: TaskCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def tasks(self) -> List[Task]:
        """Gets the tasks of this TaskCollection.


        :return: The tasks of this TaskCollection.
        :rtype: List[Task]
        """
        return self._tasks

    @tasks.setter
    def tasks(self, tasks: List[Task]):
        """Sets the tasks of this TaskCollection.


        :param tasks: The tasks of this TaskCollection.
        :type tasks: List[Task]
        """

        self._tasks = tasks

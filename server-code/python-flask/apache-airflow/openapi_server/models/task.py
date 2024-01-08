from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.class_reference import ClassReference
from openapi_server.models.dag import DAG
from openapi_server.models.task_extra_links_inner import TaskExtraLinksInner
from openapi_server.models.time_delta import TimeDelta
from openapi_server.models.trigger_rule import TriggerRule
from openapi_server.models.weight_rule import WeightRule
import re
from openapi_server import util

from openapi_server.models.class_reference import ClassReference  # noqa: E501
from openapi_server.models.dag import DAG  # noqa: E501
from openapi_server.models.task_extra_links_inner import TaskExtraLinksInner  # noqa: E501
from openapi_server.models.time_delta import TimeDelta  # noqa: E501
from openapi_server.models.trigger_rule import TriggerRule  # noqa: E501
from openapi_server.models.weight_rule import WeightRule  # noqa: E501
import re  # noqa: E501

class Task(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, class_ref=None, depends_on_past=None, downstream_task_ids=None, end_date=None, execution_timeout=None, extra_links=None, is_mapped=None, owner=None, pool=None, pool_slots=None, priority_weight=None, queue=None, retries=None, retry_delay=None, retry_exponential_backoff=None, start_date=None, sub_dag=None, task_id=None, template_fields=None, trigger_rule=None, ui_color=None, ui_fgcolor=None, wait_for_downstream=None, weight_rule=None):  # noqa: E501
        """Task - a model defined in OpenAPI

        :param class_ref: The class_ref of this Task.  # noqa: E501
        :type class_ref: ClassReference
        :param depends_on_past: The depends_on_past of this Task.  # noqa: E501
        :type depends_on_past: bool
        :param downstream_task_ids: The downstream_task_ids of this Task.  # noqa: E501
        :type downstream_task_ids: List[str]
        :param end_date: The end_date of this Task.  # noqa: E501
        :type end_date: datetime
        :param execution_timeout: The execution_timeout of this Task.  # noqa: E501
        :type execution_timeout: TimeDelta
        :param extra_links: The extra_links of this Task.  # noqa: E501
        :type extra_links: List[TaskExtraLinksInner]
        :param is_mapped: The is_mapped of this Task.  # noqa: E501
        :type is_mapped: bool
        :param owner: The owner of this Task.  # noqa: E501
        :type owner: str
        :param pool: The pool of this Task.  # noqa: E501
        :type pool: str
        :param pool_slots: The pool_slots of this Task.  # noqa: E501
        :type pool_slots: float
        :param priority_weight: The priority_weight of this Task.  # noqa: E501
        :type priority_weight: float
        :param queue: The queue of this Task.  # noqa: E501
        :type queue: str
        :param retries: The retries of this Task.  # noqa: E501
        :type retries: float
        :param retry_delay: The retry_delay of this Task.  # noqa: E501
        :type retry_delay: TimeDelta
        :param retry_exponential_backoff: The retry_exponential_backoff of this Task.  # noqa: E501
        :type retry_exponential_backoff: bool
        :param start_date: The start_date of this Task.  # noqa: E501
        :type start_date: datetime
        :param sub_dag: The sub_dag of this Task.  # noqa: E501
        :type sub_dag: DAG
        :param task_id: The task_id of this Task.  # noqa: E501
        :type task_id: str
        :param template_fields: The template_fields of this Task.  # noqa: E501
        :type template_fields: List[str]
        :param trigger_rule: The trigger_rule of this Task.  # noqa: E501
        :type trigger_rule: TriggerRule
        :param ui_color: The ui_color of this Task.  # noqa: E501
        :type ui_color: str
        :param ui_fgcolor: The ui_fgcolor of this Task.  # noqa: E501
        :type ui_fgcolor: str
        :param wait_for_downstream: The wait_for_downstream of this Task.  # noqa: E501
        :type wait_for_downstream: bool
        :param weight_rule: The weight_rule of this Task.  # noqa: E501
        :type weight_rule: WeightRule
        """
        self.openapi_types = {
            'class_ref': ClassReference,
            'depends_on_past': bool,
            'downstream_task_ids': List[str],
            'end_date': datetime,
            'execution_timeout': TimeDelta,
            'extra_links': List[TaskExtraLinksInner],
            'is_mapped': bool,
            'owner': str,
            'pool': str,
            'pool_slots': float,
            'priority_weight': float,
            'queue': str,
            'retries': float,
            'retry_delay': TimeDelta,
            'retry_exponential_backoff': bool,
            'start_date': datetime,
            'sub_dag': DAG,
            'task_id': str,
            'template_fields': List[str],
            'trigger_rule': TriggerRule,
            'ui_color': str,
            'ui_fgcolor': str,
            'wait_for_downstream': bool,
            'weight_rule': WeightRule
        }

        self.attribute_map = {
            'class_ref': 'class_ref',
            'depends_on_past': 'depends_on_past',
            'downstream_task_ids': 'downstream_task_ids',
            'end_date': 'end_date',
            'execution_timeout': 'execution_timeout',
            'extra_links': 'extra_links',
            'is_mapped': 'is_mapped',
            'owner': 'owner',
            'pool': 'pool',
            'pool_slots': 'pool_slots',
            'priority_weight': 'priority_weight',
            'queue': 'queue',
            'retries': 'retries',
            'retry_delay': 'retry_delay',
            'retry_exponential_backoff': 'retry_exponential_backoff',
            'start_date': 'start_date',
            'sub_dag': 'sub_dag',
            'task_id': 'task_id',
            'template_fields': 'template_fields',
            'trigger_rule': 'trigger_rule',
            'ui_color': 'ui_color',
            'ui_fgcolor': 'ui_fgcolor',
            'wait_for_downstream': 'wait_for_downstream',
            'weight_rule': 'weight_rule'
        }

        self._class_ref = class_ref
        self._depends_on_past = depends_on_past
        self._downstream_task_ids = downstream_task_ids
        self._end_date = end_date
        self._execution_timeout = execution_timeout
        self._extra_links = extra_links
        self._is_mapped = is_mapped
        self._owner = owner
        self._pool = pool
        self._pool_slots = pool_slots
        self._priority_weight = priority_weight
        self._queue = queue
        self._retries = retries
        self._retry_delay = retry_delay
        self._retry_exponential_backoff = retry_exponential_backoff
        self._start_date = start_date
        self._sub_dag = sub_dag
        self._task_id = task_id
        self._template_fields = template_fields
        self._trigger_rule = trigger_rule
        self._ui_color = ui_color
        self._ui_fgcolor = ui_fgcolor
        self._wait_for_downstream = wait_for_downstream
        self._weight_rule = weight_rule

    @classmethod
    def from_dict(cls, dikt) -> 'Task':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Task of this Task.  # noqa: E501
        :rtype: Task
        """
        return util.deserialize_model(dikt, cls)

    @property
    def class_ref(self) -> ClassReference:
        """Gets the class_ref of this Task.


        :return: The class_ref of this Task.
        :rtype: ClassReference
        """
        return self._class_ref

    @class_ref.setter
    def class_ref(self, class_ref: ClassReference):
        """Sets the class_ref of this Task.


        :param class_ref: The class_ref of this Task.
        :type class_ref: ClassReference
        """

        self._class_ref = class_ref

    @property
    def depends_on_past(self) -> bool:
        """Gets the depends_on_past of this Task.


        :return: The depends_on_past of this Task.
        :rtype: bool
        """
        return self._depends_on_past

    @depends_on_past.setter
    def depends_on_past(self, depends_on_past: bool):
        """Sets the depends_on_past of this Task.


        :param depends_on_past: The depends_on_past of this Task.
        :type depends_on_past: bool
        """

        self._depends_on_past = depends_on_past

    @property
    def downstream_task_ids(self) -> List[str]:
        """Gets the downstream_task_ids of this Task.


        :return: The downstream_task_ids of this Task.
        :rtype: List[str]
        """
        return self._downstream_task_ids

    @downstream_task_ids.setter
    def downstream_task_ids(self, downstream_task_ids: List[str]):
        """Sets the downstream_task_ids of this Task.


        :param downstream_task_ids: The downstream_task_ids of this Task.
        :type downstream_task_ids: List[str]
        """

        self._downstream_task_ids = downstream_task_ids

    @property
    def end_date(self) -> datetime:
        """Gets the end_date of this Task.


        :return: The end_date of this Task.
        :rtype: datetime
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date: datetime):
        """Sets the end_date of this Task.


        :param end_date: The end_date of this Task.
        :type end_date: datetime
        """

        self._end_date = end_date

    @property
    def execution_timeout(self) -> TimeDelta:
        """Gets the execution_timeout of this Task.


        :return: The execution_timeout of this Task.
        :rtype: TimeDelta
        """
        return self._execution_timeout

    @execution_timeout.setter
    def execution_timeout(self, execution_timeout: TimeDelta):
        """Sets the execution_timeout of this Task.


        :param execution_timeout: The execution_timeout of this Task.
        :type execution_timeout: TimeDelta
        """

        self._execution_timeout = execution_timeout

    @property
    def extra_links(self) -> List[TaskExtraLinksInner]:
        """Gets the extra_links of this Task.


        :return: The extra_links of this Task.
        :rtype: List[TaskExtraLinksInner]
        """
        return self._extra_links

    @extra_links.setter
    def extra_links(self, extra_links: List[TaskExtraLinksInner]):
        """Sets the extra_links of this Task.


        :param extra_links: The extra_links of this Task.
        :type extra_links: List[TaskExtraLinksInner]
        """

        self._extra_links = extra_links

    @property
    def is_mapped(self) -> bool:
        """Gets the is_mapped of this Task.


        :return: The is_mapped of this Task.
        :rtype: bool
        """
        return self._is_mapped

    @is_mapped.setter
    def is_mapped(self, is_mapped: bool):
        """Sets the is_mapped of this Task.


        :param is_mapped: The is_mapped of this Task.
        :type is_mapped: bool
        """

        self._is_mapped = is_mapped

    @property
    def owner(self) -> str:
        """Gets the owner of this Task.


        :return: The owner of this Task.
        :rtype: str
        """
        return self._owner

    @owner.setter
    def owner(self, owner: str):
        """Sets the owner of this Task.


        :param owner: The owner of this Task.
        :type owner: str
        """

        self._owner = owner

    @property
    def pool(self) -> str:
        """Gets the pool of this Task.


        :return: The pool of this Task.
        :rtype: str
        """
        return self._pool

    @pool.setter
    def pool(self, pool: str):
        """Sets the pool of this Task.


        :param pool: The pool of this Task.
        :type pool: str
        """

        self._pool = pool

    @property
    def pool_slots(self) -> float:
        """Gets the pool_slots of this Task.


        :return: The pool_slots of this Task.
        :rtype: float
        """
        return self._pool_slots

    @pool_slots.setter
    def pool_slots(self, pool_slots: float):
        """Sets the pool_slots of this Task.


        :param pool_slots: The pool_slots of this Task.
        :type pool_slots: float
        """

        self._pool_slots = pool_slots

    @property
    def priority_weight(self) -> float:
        """Gets the priority_weight of this Task.


        :return: The priority_weight of this Task.
        :rtype: float
        """
        return self._priority_weight

    @priority_weight.setter
    def priority_weight(self, priority_weight: float):
        """Sets the priority_weight of this Task.


        :param priority_weight: The priority_weight of this Task.
        :type priority_weight: float
        """

        self._priority_weight = priority_weight

    @property
    def queue(self) -> str:
        """Gets the queue of this Task.


        :return: The queue of this Task.
        :rtype: str
        """
        return self._queue

    @queue.setter
    def queue(self, queue: str):
        """Sets the queue of this Task.


        :param queue: The queue of this Task.
        :type queue: str
        """

        self._queue = queue

    @property
    def retries(self) -> float:
        """Gets the retries of this Task.


        :return: The retries of this Task.
        :rtype: float
        """
        return self._retries

    @retries.setter
    def retries(self, retries: float):
        """Sets the retries of this Task.


        :param retries: The retries of this Task.
        :type retries: float
        """

        self._retries = retries

    @property
    def retry_delay(self) -> TimeDelta:
        """Gets the retry_delay of this Task.


        :return: The retry_delay of this Task.
        :rtype: TimeDelta
        """
        return self._retry_delay

    @retry_delay.setter
    def retry_delay(self, retry_delay: TimeDelta):
        """Sets the retry_delay of this Task.


        :param retry_delay: The retry_delay of this Task.
        :type retry_delay: TimeDelta
        """

        self._retry_delay = retry_delay

    @property
    def retry_exponential_backoff(self) -> bool:
        """Gets the retry_exponential_backoff of this Task.


        :return: The retry_exponential_backoff of this Task.
        :rtype: bool
        """
        return self._retry_exponential_backoff

    @retry_exponential_backoff.setter
    def retry_exponential_backoff(self, retry_exponential_backoff: bool):
        """Sets the retry_exponential_backoff of this Task.


        :param retry_exponential_backoff: The retry_exponential_backoff of this Task.
        :type retry_exponential_backoff: bool
        """

        self._retry_exponential_backoff = retry_exponential_backoff

    @property
    def start_date(self) -> datetime:
        """Gets the start_date of this Task.


        :return: The start_date of this Task.
        :rtype: datetime
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date: datetime):
        """Sets the start_date of this Task.


        :param start_date: The start_date of this Task.
        :type start_date: datetime
        """

        self._start_date = start_date

    @property
    def sub_dag(self) -> DAG:
        """Gets the sub_dag of this Task.


        :return: The sub_dag of this Task.
        :rtype: DAG
        """
        return self._sub_dag

    @sub_dag.setter
    def sub_dag(self, sub_dag: DAG):
        """Sets the sub_dag of this Task.


        :param sub_dag: The sub_dag of this Task.
        :type sub_dag: DAG
        """

        self._sub_dag = sub_dag

    @property
    def task_id(self) -> str:
        """Gets the task_id of this Task.


        :return: The task_id of this Task.
        :rtype: str
        """
        return self._task_id

    @task_id.setter
    def task_id(self, task_id: str):
        """Sets the task_id of this Task.


        :param task_id: The task_id of this Task.
        :type task_id: str
        """

        self._task_id = task_id

    @property
    def template_fields(self) -> List[str]:
        """Gets the template_fields of this Task.


        :return: The template_fields of this Task.
        :rtype: List[str]
        """
        return self._template_fields

    @template_fields.setter
    def template_fields(self, template_fields: List[str]):
        """Sets the template_fields of this Task.


        :param template_fields: The template_fields of this Task.
        :type template_fields: List[str]
        """

        self._template_fields = template_fields

    @property
    def trigger_rule(self) -> TriggerRule:
        """Gets the trigger_rule of this Task.


        :return: The trigger_rule of this Task.
        :rtype: TriggerRule
        """
        return self._trigger_rule

    @trigger_rule.setter
    def trigger_rule(self, trigger_rule: TriggerRule):
        """Sets the trigger_rule of this Task.


        :param trigger_rule: The trigger_rule of this Task.
        :type trigger_rule: TriggerRule
        """

        self._trigger_rule = trigger_rule

    @property
    def ui_color(self) -> str:
        """Gets the ui_color of this Task.

        Color in hexadecimal notation.  # noqa: E501

        :return: The ui_color of this Task.
        :rtype: str
        """
        return self._ui_color

    @ui_color.setter
    def ui_color(self, ui_color: str):
        """Sets the ui_color of this Task.

        Color in hexadecimal notation.  # noqa: E501

        :param ui_color: The ui_color of this Task.
        :type ui_color: str
        """
        if ui_color is not None and not re.search(r'^#[a-fA-F0-9]{3,6}$', ui_color):  # noqa: E501
            raise ValueError("Invalid value for `ui_color`, must be a follow pattern or equal to `/^#[a-fA-F0-9]{3,6}$/`")  # noqa: E501

        self._ui_color = ui_color

    @property
    def ui_fgcolor(self) -> str:
        """Gets the ui_fgcolor of this Task.

        Color in hexadecimal notation.  # noqa: E501

        :return: The ui_fgcolor of this Task.
        :rtype: str
        """
        return self._ui_fgcolor

    @ui_fgcolor.setter
    def ui_fgcolor(self, ui_fgcolor: str):
        """Sets the ui_fgcolor of this Task.

        Color in hexadecimal notation.  # noqa: E501

        :param ui_fgcolor: The ui_fgcolor of this Task.
        :type ui_fgcolor: str
        """
        if ui_fgcolor is not None and not re.search(r'^#[a-fA-F0-9]{3,6}$', ui_fgcolor):  # noqa: E501
            raise ValueError("Invalid value for `ui_fgcolor`, must be a follow pattern or equal to `/^#[a-fA-F0-9]{3,6}$/`")  # noqa: E501

        self._ui_fgcolor = ui_fgcolor

    @property
    def wait_for_downstream(self) -> bool:
        """Gets the wait_for_downstream of this Task.


        :return: The wait_for_downstream of this Task.
        :rtype: bool
        """
        return self._wait_for_downstream

    @wait_for_downstream.setter
    def wait_for_downstream(self, wait_for_downstream: bool):
        """Sets the wait_for_downstream of this Task.


        :param wait_for_downstream: The wait_for_downstream of this Task.
        :type wait_for_downstream: bool
        """

        self._wait_for_downstream = wait_for_downstream

    @property
    def weight_rule(self) -> WeightRule:
        """Gets the weight_rule of this Task.


        :return: The weight_rule of this Task.
        :rtype: WeightRule
        """
        return self._weight_rule

    @weight_rule.setter
    def weight_rule(self, weight_rule: WeightRule):
        """Sets the weight_rule of this Task.


        :param weight_rule: The weight_rule of this Task.
        :type weight_rule: WeightRule
        """

        self._weight_rule = weight_rule